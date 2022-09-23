/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/21/22, 9:56 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.factory.base;

import niyredra.factory.normal.factory.model.WechatReportProperties;
import niyredra.factory.normal.product.base.ReportClient;

/**
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public abstract class ReportFactory {

    public abstract ReportClient getClient();

}
