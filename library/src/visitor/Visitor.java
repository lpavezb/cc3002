package visitor;

import library.*;

public class Visitor {

    public void visitLibrary(Library library){
        for (Item item : library.getItems())
            item.accept(this);
    }

    public void visitGame(Game game){ }

    public void visitBook(Book book){ }
}
