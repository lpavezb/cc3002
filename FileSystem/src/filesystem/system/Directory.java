package system;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractItem {
    private List<Item> items = new ArrayList<>();

    public Directory(String aName) {
        super(aName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void add(Item anItem) {
        items.add(anItem);
    }

    @Override
    public int getSize() {
        int result = 0;
        for(Item item : items)
            result += item.getSize();
        return result;
    }

    @Override
    public void accept(Visitor aVisitor) {
        aVisitor.visitDirectory(this);
    }


}
