package coffeeshopOrderingSystem.Coffee;

public class ColdBrew extends BaseCofee{
    public ColdBrew() {
        coffeeName = "Cold Brew";
    }

    @Override
    public int coffeeCost() {
        return 20;
    }
}
