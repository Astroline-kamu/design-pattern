/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/25/22, 12:25 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.factory.race;

import niyredra.factory.abstr.sc.unit.base.Unit;
import niyredra.factory.abstr.sc.unit.model.UnitSkill;

/**
 *
 * 泰伦制造工厂
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public abstract class TerranFactory {

    // 建造单位 structure标签的单位需要走这个方法
    abstract Unit buildUnit();

    // 训练单位 用于建造非structure标签的单位
    abstract Unit trainUnit();

    // 科技
    abstract UnitSkill research();

}
