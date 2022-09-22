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

import niyredra.factory.normal.product.base.ReportClient;

/**
 *
 * 设计的有些牵强，这已经是一个非优解了
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class WechatReportClient extends ReportClient {

    private WechatReportCallback callback;

    public abstract class WechatReportCallback {

        public abstract String getAccessToken(boolean force);

        public abstract String getAccessToken();
    }

    public void setCallback(WechatReportCallback callback){
        this.callback = callback;
    }

    @Override
    public void sent(String msg) {


        try {
            if (callback.getAccessToken() == null)
                throw new Exception("AccessToken已过期");

            System.out.println("发送至微信客户端：" + msg);

        }catch (Exception e) {
            callback.getAccessToken(true);
        }
    }

    @Override
    public void close() {

    }

    private void connect(String token) throws Exception {
        System.out.println("已链接");
    }

}
