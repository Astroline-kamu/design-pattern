package niyredra.factory.simple.product;

import niyredra.factory.simple.prototype.Pigeon;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class NormalPigeon extends Pigeon {

    private String name = "普通鸽子";

    @Override
    public void flyMethod() {
        System.out.println(name + "挥动两对轻巧的翅膀。");
    }

    @Override
    public void eatMethod() {
        System.out.println(name + "用力向着地面的面包屑点去。");
    }
}
