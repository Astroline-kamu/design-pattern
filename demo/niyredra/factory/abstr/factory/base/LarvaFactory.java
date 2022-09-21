/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/19/22, 10:02 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.factory.base;

/**
 *
 * 虫卵工厂 我们可以用虫巢来称呼它
 * 很显然有时候要实现的东西太多了，工厂模式就会是一个非常烦人的东西了
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public abstract class LarvaFactory {

    abstract ZergUnit mutation();

    abstract void build(ZergUnit unit);

}
