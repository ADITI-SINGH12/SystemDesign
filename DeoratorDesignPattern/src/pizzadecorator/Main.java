package pizzadecorator;

import pizzadecorator.basepizza.FarmHouse;
import pizzadecorator.basepizza.Margherita;
import pizzadecorator.basepizza.PeppyPaneer;
import pizzadecorator.basepizza.Pizza;
import pizzadecorator.topperDecorator.ExtraCheese;
import pizzadecorator.topperDecorator.FreshTomato;
import pizzadecorator.topperDecorator.Paneer;
import pizzadecorator.topperDecorator.TopingDecorator;

public class Main {
    public static void main(String[] args) {
        //single layer topping
        Pizza   pizza1 = new ExtraCheese(new FarmHouse());
        System.out.println( pizza1.getDescription() +
                " cost :" + pizza1.cost());

        //double layer topping
        Pizza   pizza2 = new Paneer(new ExtraCheese(new PeppyPaneer()));
        System.out.println( pizza2.getDescription() +
                " cost :" + pizza2.cost());

        //triple layer topping
        Pizza   pizza3 =new FreshTomato(new Paneer(new ExtraCheese(new Margherita())));
        System.out.println( pizza3.getDescription() +
                " cost :" + pizza3.cost());

      //without topping
        Pizza pizza4 = new Margherita();
        System.out.println( pizza3.getDescription() +
                " cost :" + pizza3.cost());

    }
}