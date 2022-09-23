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

import niyredra.factory.normal.common.handler.WechatReportClientHandler;
import niyredra.factory.normal.product.base.ReportClient;

/**
 *
 * 设计的有些牵强，这已经是一个非优解了
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class WechatReportClient extends ReportClient {

    /**
     * 消息发送
     *
     * @param msg 发送信息
     * @param retry 重新尝试的次数
     */
    public void sent(String msg, int retry) {

        try {
            String token = WechatReportClientHandler.getAccessToken();
            if (token == null)
                throw new Exception("AccessToken不存在");
            System.out.println("使用" + token + " 发送至微信客户端：" + msg);
        }catch (Exception e) {
            if (retry > 0) {
                WechatReportClientHandler.getAccessToken(true);
                System.out.println("AccessToken已过期，重新获取");
                sent(msg, retry - 1);
            }else {
                System.out.println("AccessToken无法获取！");
            }
        }
    }

    /**
     * 消息发送 默认重新尝试请求三次
     *
     * @param msg
     */
    @Override
    public void sent(String msg) {
        // 默认重新尝试时间
        sent(msg, 3);
    }


    @Override
    public void close() {
        System.out.println("关闭微信请求链接");
    }


}
