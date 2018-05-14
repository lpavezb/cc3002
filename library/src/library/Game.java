package library;

import visitor.Visitor;

public class Game extends AbstractItem {
    public Game(String name, int date) {
        super(name, date);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGame(this);
    }
}