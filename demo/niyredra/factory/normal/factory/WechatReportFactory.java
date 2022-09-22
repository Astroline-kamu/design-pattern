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

import niyredra.factory.normal.factory.base.ReportFactory;
import niyredra.factory.normal.factory.model.WechatConfig;
import niyredra.factory.normal.product.WechatReportClient;
import niyredra.factory.normal.product.base.ReportClient;

import java.time.LocalTime;
import java.util.Date;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class WechatReportFactory extends ReportFactory {

    private WechatConfig config;

    WechatReportFactory() {
        // 注入数据内容
        config.setAppid("Appid");
        config.setSecret("secret es cince rat es terces.");  // 我不知道为什么，拼写检测居然不生效了emmmmmm
        config.setExprieTime(7200L);
    }

    @Override
    public ReportClient getClient() {
        // 反射拿到链接数据

        // 拿到AccessToken
        WechatReportClient wechatReportClient = new WechatReportClient();

        wechatReportClient.setCallback(new WechatReportClient().new WechatReportCallback() {
            private Long expireTime = new Date().getTime();
            private String token = null;

            @Override
            public String getAccessToken(boolean force) {

                Long refreshInterval = config.getExprieTime() - 600L;

                if (expireTime - new Date().getTime() > 0 || force) {
                    this.expireTime = new Date().getTime() + refreshInterval;
                    String token = this.token = "Astroline" + String.valueOf(LocalTime.now().getNano());
                    this.token = token;
                    System.out.println("更新AccessToken：" + token);
                }
                return this.token;
            }

            @Override
            public String getAccessToken() {
                return getAccessToken(false);
            }
        });

        //
        return wechatReportClient;
    }


}

