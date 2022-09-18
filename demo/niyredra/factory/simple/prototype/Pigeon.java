package niyredra.factory.simple.prototype;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public abstract class Pigeon{

    private String name = "鸽子";

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
