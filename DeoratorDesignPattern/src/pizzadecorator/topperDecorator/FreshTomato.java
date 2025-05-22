package pizzadecorator.topperDecorator;

import pizzadecorator.basepizza.Pizza;

public  class FreshTomato extends TopingDecorator{
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Fresh Tomato";
    }
}
