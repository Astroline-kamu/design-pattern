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

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public class UnitSkill {

    private String name;

    private String description;

    // todo 使用键盘Key位做类型
    private String shortcut;

    private String secShortcut;
}
