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
