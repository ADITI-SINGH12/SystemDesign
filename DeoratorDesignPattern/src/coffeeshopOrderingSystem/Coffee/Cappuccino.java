package coffeeshopOrderingSystem.Coffee;

public class Cappuccino extends BaseCofee{
    public Cappuccino() {
        coffeeName = "Cappuccino";
    }

    @Override
    public int coffeeCost() {
        return 15;
    }
}
