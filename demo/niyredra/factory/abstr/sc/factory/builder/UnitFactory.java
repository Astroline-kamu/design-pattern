/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 10/18/22, 5:27 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.factory.builder;

import niyredra.factory.abstr.sc.factory.skill.UnitAbilityFactory;
import niyredra.factory.abstr.sc.model.unit.base.Unit;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public interface UnitFactory {

    // 训练单位 用于建造非structure标签的单位
    Unit train();

    // 科技
    UnitAbilityFactory research();


}
