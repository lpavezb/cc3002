package library;

import visitor.Visitor;

public interface Item {
    public String getName();
    public int getYear();

    void accept(Visitor visitor);
}
