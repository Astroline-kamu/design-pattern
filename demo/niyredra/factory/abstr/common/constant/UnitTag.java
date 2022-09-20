/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/20/22, 7:48 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.common.constant;

import lombok.Getter;

/**
 * 属性标签 - todo 有必要继承么？理论上，我需要扩展出新的标签出来
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Getter
public enum UnitTag {

    // 名字是暂时标记使用 最后会同步入代码
    WALK(1),
    FLY(1 << 1),
    HERO(1 << 2),
    HEAVY(1 << 3),
    LIGHT(1 << 4),
    DETECT(1 << 5),
    BUILDING(1 << 6),
    PSIONICS(1 << 7),
    MACHANICAL(1 << 8),
    BIOLOGICAL(1 << 9)
    ;


    private int tag;

    UnitTag(int tag) {
        this.tag = tag;
    }
}
