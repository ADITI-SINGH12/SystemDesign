package coffeeshopOrderingSystem.Coffee;

public abstract class BaseCofee {
    public String coffeeName= "unknown";

    public String getCoffeeName() {
        return coffeeName;
    }
    public abstract int coffeeCost();
}
