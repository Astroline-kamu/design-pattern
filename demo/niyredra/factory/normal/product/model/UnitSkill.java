/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/20/22, 12:15 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.product.model;

import lombok.Data;

import java.awt.event.KeyEvent;

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
