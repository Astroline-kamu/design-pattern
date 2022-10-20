/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 10/19/22, 8:56 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.factory.skill;

import lombok.Data;

/**
 *
 * 你会发现，Skill和Unit的关系本身又是一个工厂了 我不可否认AbstractFactory是一个复杂工厂qwq
 * 但是这也证实了一点，我们可以在创建之前用工厂将一系列功能组装起来，每一个Unit本身就是一个生产线 同时 对于创建来说其实工厂不是首选 但是这里我使用了工厂模式来分离出用来生产单位的建筑
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public abstract class UnitAbilityFactory {

    private String id;

    private String name;

    private String description;

    // todo 使用键盘Key位做类型 并且存在技能树的概念 建议使用xml做中间件（待实现）
    private String shortcut;

    // 备用快捷键
    private String secShortcut;

    abstract void effect();
}
