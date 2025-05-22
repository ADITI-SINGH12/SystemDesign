package pizzadecorator.topperDecorator;

import pizzadecorator.basepizza.Pizza;

public class ExtraCheese extends TopingDecorator{
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Extra Cheese";
    }
}
