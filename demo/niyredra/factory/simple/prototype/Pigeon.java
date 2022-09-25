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

package niyredra.factory.simple.prototype;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public abstract class Pigeon{

    protected String name = "鸽子";

    public Pigeon(String name) {
        this.name = name;
    }

    public void beingCaught() {
        System.out.println("捕获" + name + "！");
    }

    public void fly() {
        System.out.println(name + "飞起来了！");
    }

    public void eat(){
        System.out.println(name + "吃到了食物！");
    }

    public abstract void flyMethod();

    public abstract void eatMethod();

    public String getName() {
        return name;
    }

}
