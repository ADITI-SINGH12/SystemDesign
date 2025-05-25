package coffeeshopOrderingSystem.materials;

import coffeeshopOrderingSystem.Coffee.BaseCofee;

public class HotWater extends CoffeeAddOns{
    BaseCofee baseCofee;

    public HotWater(BaseCofee baseCofee) {
        this.baseCofee = baseCofee;
    }

    @Override
    public String getCoffeeName() {
        return this.baseCofee.getCoffeeName()+", Hot Water";
    }

    @Override
    public int coffeeCost() {
        return this.baseCofee.coffeeCost()+5;
    }
}
