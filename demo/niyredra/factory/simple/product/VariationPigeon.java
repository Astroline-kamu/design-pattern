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
public class VariationPigeon extends Pigeon {

    private String name = "异鸽鸽子";

    @Override
    public void flyMethod() {
        System.out.println(name + "开始转起了脑袋！");
    }

    @Override
    public void eatMethod() {
        System.out.println(name + "开始大口吸气！");
    }
}
