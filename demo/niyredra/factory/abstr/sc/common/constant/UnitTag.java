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

package niyredra.factory.abstr.sc.common.constant;

import lombok.Getter;

/**
 * 属性标签 - todo 有必要继承么？理论上，我需要扩展出新的标签出来
 * 我重新理解了下这个部分，它更像是一种单位的描述，比如说打上了Untransportable标签，就是不能装载单位；打上了Structure，它就是建筑单位
 * 这东西并不是一个标签这么简单我觉得，可能还和实现设计有关系，比如，Structure标签的单位会多出来Size（宽高）属性（星际里好像没有长方形的建筑吧？）
 *
 * 用注解的形式将标签注入到Pojo里，每个Pojo必须有至少一个标签？
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Getter
public enum UnitTag {
    ARMORED(1),  // 重甲
    LIGHT(1 << 2),
    HEROIC(1 << 3),
    MASSIVE(1 << 4),  // 重型单位
    PSIONIC(1 << 5),
    SUMMONED(1 << 6),
    STRUCTURE(1 << 7),
    MECHANICAL(1 << 8),
    BIOLOGICAL(1 << 9),
    UNTRANSPORTABLE(1 << 10)  // 不能运输
    ;

    private final int tag;

    UnitTag(int tag) {
        this.tag = tag;
    }
}
