package niyredra.factory.simple.product;

import niyredra.factory.simple.prototype.Pigeon;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class GodPigeon extends Pigeon {

    private String name = "飞天神鸽";

    @Override
    public void flyMethod() {
        System.out.println(name + "挥一挥衣袖。");
    }

    @Override
    public void eatMethod() {
        System.out.println(name + "张开了嘴。");
    }
}
