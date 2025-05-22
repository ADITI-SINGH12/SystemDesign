package pizzadecorator.basepizza;

public class FarmHouse extends Pizza{
    public FarmHouse() {
        description = "Farm House pizza";
    }

    @Override
  public int cost() {
        return 140;
    }
}
