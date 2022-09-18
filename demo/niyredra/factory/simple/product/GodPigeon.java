/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/18/22, 4:04 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.simple.product;

import niyredra.factory.simple.prototype.Pigeon;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class GodPigeon extends Pigeon {

    public GodPigeon() {
        super("飞天神鸽");
    }

    @Override
    public void flyMethod() {
        System.out.println(name + "挥一挥衣袖。");
    }

    @Override
    public void eatMethod() {
        System.out.println(name + "张开了嘴。");
    }
}
