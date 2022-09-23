/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/23/22, 12:14 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.test;

import common.test.RootTest;
import common.test.annotation.Test;
import niyredra.factory.normal.factory.EmailReportFactory;
import niyredra.factory.normal.factory.SMSReportFactory;
import niyredra.factory.normal.factory.WechatReportFactory;
import niyredra.factory.normal.product.EmailReportClient;
import niyredra.factory.normal.product.WechatReportClient;
import niyredra.factory.normal.product.base.ReportClient;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class NormalFactoryTest extends RootTest {

    @Test
    public void wechatReportTest(){
        WechatReportFactory factory = new WechatReportFactory();
        ReportClient client = factory.getClient();

        client.sent("您有一条新的微信告警推送消息，请查收。");
        client.close();
    }

    @Test
    public void smsReportTest(){
        SMSReportFactory factory = new SMSReportFactory();
        ReportClient client = factory.getClient();

        client.sent("1108 is you safety code, please remember and never forgot.");
        client.close();
    }

    @Test
    public void emailReportTest(){
        EmailReportFactory factory = new EmailReportFactory();
        ReportClient client = factory.getClient();

        client.sent("这是条基于imap发送的邮件信息。");
        client.close();
    }

}
