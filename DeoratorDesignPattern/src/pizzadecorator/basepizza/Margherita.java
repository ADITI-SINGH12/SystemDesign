package pizzadecorator.basepizza;

public class Margherita extends Pizza{
    public Margherita() {
        description = "Margherita";
    }

    @Override
    public int cost() {
        return 100;
    }
}
