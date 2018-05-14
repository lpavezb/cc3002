package visitor;


import system.Directory;

public class NumberOfDirectoryVisitor extends Visitor {
    private int numberOfDirectory = 0;

    @Override
    public void visitDirectory(Directory d) {
        super.visitDirectory(d);
        numberOfDirectory++;
    }
    public int getResult() {
        return numberOfDirectory;
    }
}
