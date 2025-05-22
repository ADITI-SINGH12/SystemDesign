package pizzadecorator.basepizza;

public class PeppyPaneer extends Pizza{

    public PeppyPaneer() {
      description = "Peppy Paneer";
    }

    @Override
   public int cost() {
        return 160;
    }
}
