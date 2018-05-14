package system;

import visitor.Visitor;

public class BinaryFile extends AbstractFile {
    public BinaryFile(String aName, byte[] content) {
        super(aName);
        size = content.length;
    }

    @Override
    public void accept(Visitor aVisitor) {
        aVisitor.visitBinaryFile(this);
    }
}
