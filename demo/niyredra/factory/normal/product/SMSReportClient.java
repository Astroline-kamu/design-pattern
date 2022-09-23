/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/21/22, 10:04 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.product;

import lombok.SneakyThrows;
import niyredra.factory.normal.factory.model.SMSReportProperties;
import niyredra.factory.normal.product.base.ReportClient;

import java.net.URLEncoder;

/**
 * 以聚合流程为例
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class SMSReportClient extends ReportClient {

    SMSReportProperties properties;

    public SMSReportClient(SMSReportProperties properties) {
        this.properties = properties;
    }

    public SMSReportClient(String mobile, int tplId, String tplValue, String key) {
        this.properties = new SMSReportProperties(mobile, tplId, tplValue, key);
    }

    @Override
    public void sent(String msg) {
        if (this.properties == null) try {
            throw new Exception("SMSReportClient没有初始化Properties，无法发送请求！");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 编写请求工具
        System.out.println("SMS信息发送中，内容：" + URLEncoder.encode(msg));

        // 获得返回数据 如果发送成功开始计时，发送失败抛出异常

    }

    @Override
    public void close() {
        try {
            System.out.println("SMSReportClient ... shutdown ...");
            this.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
