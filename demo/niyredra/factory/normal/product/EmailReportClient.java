/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/21/22, 10:00 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.product;

import niyredra.factory.normal.factory.model.EmailReportProperties;
import niyredra.factory.normal.product.base.ReportClient;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Properties;

/**
 * 邮件是一个可以被二次封装的东西 因为它足够复杂，又或者也没有那么复杂——总之，这里只有工厂，我不去写点别的东西
 * 引用一个tomcat的包
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class EmailReportClient extends ReportClient {

    EmailReportProperties properties;

    Store store;

    public EmailReportClient(EmailReportProperties properties) {
        this.properties = properties;
    }

    public EmailReportClient(String address, String account, String password, String protocol) {
        this.properties = new EmailReportProperties(address, account, password, protocol, "993");
    }

    public EmailReportClient(String address, String account, String password, String protocol, String port) {
        this.properties = new EmailReportProperties(address, account, password, protocol, port);
    }

    @Override
    public void sent(String msg) {
        // 建立链接 业务差不多是这样，可是数据——
//            connectMail();

        // 发送消息
        System.out.println("Email发送消息：" + msg);
    }

    @Override
    public void close() {
        System.out.println("销毁对象 (其实没有必要)");
//        try {
//            this.store.close();
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
    }

    private void connectMail() throws MessagingException {
        if (this.properties == null) throw new RuntimeException("邮箱信息未初始化，请检查代码");
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", this.properties.protocol());
        props.setProperty("mail.imap.host", this.properties.address());
        // 默认993 我也不想加更多配置在里面了，会显得很臃肿
        props.setProperty("mail.imap.port", this.properties.port());

        // 我在想 如果我在props中配置了所有的参数，store是不是就可以直接connect了awa
        Session session = Session.getInstance(props);
        this.store = session.getStore();

        // host user password
        this.store.connect(this.properties.address(), this.properties.account(), this.properties.password());
    }

}
