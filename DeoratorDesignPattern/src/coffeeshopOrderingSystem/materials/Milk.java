package coffeeshopOrderingSystem.materials;

import coffeeshopOrderingSystem.Coffee.BaseCofee;

public class Milk extends CoffeeAddOns{
    BaseCofee baseCofee;

    public Milk(BaseCofee baseCofee) {
        this.baseCofee = baseCofee;
    }

    @Override
    public String getCoffeeName() {
        return baseCofee.getCoffeeName()+"Milk";
    }

    @Override
    public int coffeeCost() {
        return this.baseCofee.coffeeCost()+12;
    }
}
