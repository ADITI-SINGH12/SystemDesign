package pizzadecorator.topperDecorator;


import pizzadecorator.basepizza.Pizza;

public abstract class TopingDecorator extends Pizza {
    public abstract String getDescription();
}
