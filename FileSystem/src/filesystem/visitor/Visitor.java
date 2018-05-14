package visitor;

import system.*;

public class Visitor {
    public void visitBinaryFile(BinaryFile binaryFile) {
    }

    public void visitTextFile(TextFile textFile) {
    }

    public void visitDirectory(Directory directory) {
        for(Item item : directory.getItems())
            item.accept(this);
    }
}
