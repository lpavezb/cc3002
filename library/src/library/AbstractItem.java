package library;

public abstract class AbstractItem implements Item {
    private String name;
    private int date;

    public AbstractItem(String aName, int date) {
        this.name = aName;
        this.date = date;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return date;
    }

}
