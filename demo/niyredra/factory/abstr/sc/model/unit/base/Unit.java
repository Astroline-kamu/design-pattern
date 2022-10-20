/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 10/19/22, 8:57 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.model.unit.base;

import lombok.Data;
import niyredra.factory.abstr.sc.model.skill.base.UnitAbility;

import java.util.List;

/**
 * 单位会被继承，是Terran、Protoss又或者Zerg。
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public class Unit {

    public Unit() {
    }

    public Unit(String name, float life,) {
        this.name = name;
    }

    private int tag;

    private String introduce;

    private String title;

    private String name;

    // 最小颗粒度是0.5 一次最少扣除0.5 如果为null则是无敌 不可被选中的目标
    private float life;

    // 需被实现后可用 并且这是一个树桩结构 有一个空技能用来检测技能列表
    // skill是个技能，也可以说Abilities，需要研发的技能就是Upgrades
    private List<UnitAbility> abilities;

    // 用abilities && upgrades的内容进行科技树判断，标识物为 AbilityId
    private List<UnitAbility> upgrades;

    // mark 属性是可以用静态文本反射上去的 这里我觉得用武器系统会合适一些（具体参考心之所向Mod）不同的武器有不同的偏好 多武器的时候我们可以禁用、或者使用默认武器
    private UnitAttackProperty property;

    private int armor;

    // 射程
    private int range;

    private Model model;

}
