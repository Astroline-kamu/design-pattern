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

package niyredra.factory.simple.common.constant;

import niyredra.factory.simple.product.GodPigeon;
import niyredra.factory.simple.product.NormalPigeon;
import niyredra.factory.simple.product.VariationPigeon;
import niyredra.factory.simple.prototype.Pigeon;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public enum PigeonType {

    GOD("God Pigeon", GodPigeon.class),
    NORMAL("Normal Pigeon", NormalPigeon.class),
    VARIATION("Variation Pigeon", VariationPigeon.class);

    private String type;

    private Class<Pigeon> clazz;

    PigeonType(String type, Class clazz) {
        this.type = type;
        this.clazz = clazz;
    }

    public String getType() {
        return type;
    }

    public Class<Pigeon> getClazz() {
        return clazz;
    }
}
