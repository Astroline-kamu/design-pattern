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

package niyredra.factory.abstr.sc.unit.base;

import lombok.Data;
import niyredra.factory.abstr.sc.unit.model.UnitAttackProperty;
import niyredra.factory.abstr.sc.unit.model.UnitSkill;

/**
 *
 * 单位会被继承，是Terran、Protoss又或者Zerg。
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public class Unit {

    private int tag;

    private String name;

    // 最小颗粒度是0.5 一次最少扣除0.5
    private float hp;

    private UnitSkill skill;

    // mark 属性是可以用静态文本反射上去的
    private UnitAttackProperty property;

    private int armor;

}
