/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/22/22, 3:51 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.factory;

import niyredra.factory.normal.common.handler.WechatReportClientHandler;
import niyredra.factory.normal.factory.base.ReportFactory;
import niyredra.factory.normal.factory.model.WechatReportProperties;
import niyredra.factory.normal.product.WechatReportClient;
import niyredra.factory.normal.product.base.ReportClient;

/**
 * 流程1 将Handler静态化，没有Factory什么事了
 *
 * @author Niyredra Astroline_kamu@outlook.com
 * @see SMSReportClient
 */
public class WechatReportFactory extends ReportFactory {

    /**
     * 我只想说 重载了这么多方法，确实不如用xml配置反射属性上去的简洁...
     *
     * @return
     */
    public ReportClient getClient(WechatReportProperties wechatReportProperties) {
        // 反射拿到链接数据装入Config中 - 没写！
        WechatReportClientHandler.setProperties(wechatReportProperties);

        // 拿到AccessToken - 不需要！

        // 返回客户端！
        return new WechatReportClient();
    }

    public ReportClient getClient(String appid, String secret, long exprieTime) {
        return getClient(
                new WechatReportProperties(appid, secret, exprieTime)
        );
    }

    public ReportClient getClient(String appid, String secret) {
        return getClient(
                new WechatReportProperties(appid, secret, 7200L)
        );
    }

    @Override
    public ReportClient getClient() {
        return getClient(new WechatReportProperties("Appid", "secret es cince rat es terces", 7200L));
    }


}

