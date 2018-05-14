package system;

import visitor.Visitor;

public interface Item {
    int getSize();
    String getName();
    void accept(Visitor aVisitor);
}
