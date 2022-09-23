/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/23/22, 11:31 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.factory.model;

/**
 * 其实，record类是可以使用工厂的方式自动注入的，将大部分参数默认，只需要♏️一部分就行2333
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public record EmailReportProperties(String address, String account, String password, String protocol, String port) {
}
