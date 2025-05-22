package pizzadecorator.topperDecorator;

import pizzadecorator.basepizza.Pizza;

public class Paneer extends TopingDecorator{
    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ ", Paneer ";
    }
}
