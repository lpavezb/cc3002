package visitor;

import system.BinaryFile;
import system.Directory;
import system.TextFile;

public class ListingVisitor extends Visitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visitTextFile(TextFile f){
        processItem(f.getName());
    }

    @Override
    public void visitBinaryFile(BinaryFile f){
        processItem(f.getName());
    }

    @Override
    public void visitDirectory(Directory d){
        processItem(d.getName());
        super.visitDirectory(d);
    }

    private void processItem(String name) {
        sb.append(name).append("\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
