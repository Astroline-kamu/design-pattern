/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/20/22, 7:47 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.product.base;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * 单位会被继承，是Terran、Protoss又或者Zerg。
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public class ZergUnit {

    private int tag;

    private String name;

    // 最小颗粒度是0.5 一次最少扣除0.5
    private float hp;

    // 地面 - 单位
    private BigDecimal walk;

    // 地面 - 重甲 - 单位
    private BigDecimal walkHeavy;

    // 地面 - 轻甲 - 单位
    private BigDecimal walkLight;

    // 空中 - 单位
    private BigDecimal fly;

    // 空中 - 重甲 - 单位
    private BigDecimal flyHeavy;

    // 空中 - 轻甲 - 单位
    private BigDecimal flyLight;

    private int armor;

}
