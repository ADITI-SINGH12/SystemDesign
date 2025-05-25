package coffeeshopOrderingSystem;

import coffeeshopOrderingSystem.Coffee.BaseCofee;
import coffeeshopOrderingSystem.Coffee.Cappuccino;
import coffeeshopOrderingSystem.materials.CoffeeAddOns;
import coffeeshopOrderingSystem.materials.Milk;
import coffeeshopOrderingSystem.materials.Sugar;

public class CoffeeClient {
    public static void main(String[] args) {
      //  BaseCofee baseCofee = new Cappuccino();
        BaseCofee coffee1 = new Milk(new Sugar(new Cappuccino()));
        System.out.println(coffee1.getCoffeeName()+ " Rs "+coffee1.coffeeCost());
    }
}
