/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 10/19/22, 9:28 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.model.skill.base;

import lombok.Data;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public abstract class UnitAbility {

    private String AbilityId;

    private String name;

    private String description;

    // todo 使用键盘Key位做类型 并且存在技能树的概念 建议使用xml做中间件（待实现）
    private String shortcut;

    // 备用快捷键
    private String secShortcut;

    abstract void effect();
}
