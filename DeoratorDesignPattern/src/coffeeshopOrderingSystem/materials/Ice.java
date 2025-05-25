package coffeeshopOrderingSystem.materials;

import coffeeshopOrderingSystem.Coffee.BaseCofee;

public class Ice extends CoffeeAddOns{
    BaseCofee baseCofee;

    public Ice(BaseCofee baseCofee) {
        this.baseCofee = baseCofee;
    }

    @Override
    public String getCoffeeName() {
        return this.baseCofee.getCoffeeName()+", Ice";
    }

    @Override
    public int coffeeCost() {
        return this.baseCofee.coffeeCost()+10;
    }
}
