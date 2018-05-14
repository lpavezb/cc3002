package library;

import visitor.Visitor;

public class Book extends AbstractItem {
    public Book(String aName, int date) {
        super(aName, date);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}
