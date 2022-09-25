/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/25/22, 12:15 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.unit.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * 单位属性
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public class UnitAttackProperty {

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

    // 修改到一个专门的Handler中
    public BigDecimal getAttack(){

        // 假定条件：轻甲13、对空12。
        // 优先级在：轻甲 ->> 对空。
        // 对面空军是轻甲 返回13 对面空军是重甲或者英雄等其它标签 返回12

        return walk;
    }

}
