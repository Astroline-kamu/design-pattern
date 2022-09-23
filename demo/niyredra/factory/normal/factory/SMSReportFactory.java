/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/23/22, 11:53 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.factory;

import niyredra.factory.normal.factory.base.ReportFactory;
import niyredra.factory.normal.factory.model.SMSReportProperties;
import niyredra.factory.normal.product.SMSReportClient;
import niyredra.factory.normal.product.base.ReportClient;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class SMSReportFactory extends ReportFactory {

    @Override
    public ReportClient getClient() {
        return new SMSReportClient(
                "18110...你不会真的以为我会把我手机号开源的吧？！",
                1,
                "#code#=12345",
                "key ese yek");
    }

    public ReportClient getClient(SMSReportProperties properties) {
        return new SMSReportClient(properties);
    }

}
