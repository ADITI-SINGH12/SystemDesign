package coffeeshopOrderingSystem.materials;

import coffeeshopOrderingSystem.Coffee.BaseCofee;

public class Sugar extends CoffeeAddOns{
    BaseCofee baseCofee;

    public Sugar(BaseCofee baseCofee) {
        this.baseCofee = baseCofee;
    }

    @Override
    public String getCoffeeName() {
        return this.baseCofee.getCoffeeName()+", Sugar";
    }

    @Override
    public int coffeeCost() {
        return this.baseCofee.coffeeCost()+5;
    }
}
