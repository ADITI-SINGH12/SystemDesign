package coffeeshopOrderingSystem.Coffee;

public class Espresso extends BaseCofee{
    public Espresso() {
        coffeeName = "Espresso";
    }

    @Override
    public int coffeeCost() {
        return 20;
    }
}
