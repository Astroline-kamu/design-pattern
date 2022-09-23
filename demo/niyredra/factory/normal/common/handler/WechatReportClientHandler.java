/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/22/22, 6:24 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.common.handler;

import niyredra.factory.normal.factory.model.WechatReportProperties;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * 写来写去，还是发现容器好用= =
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class WechatReportClientHandler {

    private static Long expireTime = new Date().getTime() - 1L;
    private static String token = null;

    private static WechatReportProperties properties;

    public static String getAccessToken(boolean force) {
        Long refreshInterval = properties.exprieTime() - 600L;
        if (new Date().getTime() >= expireTime || force) {
            expireTime = new Date().getTime() + refreshInterval;
            token = "Astroline@" + String.valueOf(LocalTime.now().getNano());
            System.out.println("更新AccessToken：" + token);
        }
        return token;
    }

    public static String getAccessToken() {
        return getAccessToken(false);
    }

    public static void setProperties(WechatReportProperties properties) {
        WechatReportClientHandler.properties = properties;
    }
}
