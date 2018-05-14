package system;

import visitor.Visitor;

public class TextFile extends AbstractFile {

    public TextFile(String aName, String content) {
        super(aName);
        size = content.length();
    }

    @Override
    public void accept(Visitor aVisitor) {
        aVisitor.visitTextFile(this);
    }
}
