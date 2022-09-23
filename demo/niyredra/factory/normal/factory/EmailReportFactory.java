/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/23/22, 11:47 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.factory;

import niyredra.factory.normal.factory.base.ReportFactory;
import niyredra.factory.normal.factory.model.EmailReportProperties;
import niyredra.factory.normal.product.EmailReportClient;
import niyredra.factory.normal.product.base.ReportClient;

/**
 *
 * 不过按理说，email开启链接的内容不应该写到这里么awa
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class EmailReportFactory extends ReportFactory {

    @Override
    public ReportClient getClient() {
        return new EmailReportClient(
                // 企业微信为例 实际账号要和企业微信账号相同 此处写的是我私人邮箱awa
                "imap.exmail.qq.com",
                "Astroline_kamu@outlook.com",
                "password ass word ... wtf...",
                "imap"
        );
    }

    public ReportClient getClient(EmailReportProperties properties) {
        return new EmailReportClient(properties);
    }

}
