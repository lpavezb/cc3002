package system;

public abstract class AbstractItem implements Item {
    private String name;

    @Override
    public abstract int getSize();

    @Override
    public String getName() {
        return name;
    }

    public AbstractItem(String aName) {
        name = aName;
    }
}
