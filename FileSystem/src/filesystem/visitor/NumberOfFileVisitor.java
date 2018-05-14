package visitor;


import system.BinaryFile;
import system.TextFile;

public class NumberOfFileVisitor extends Visitor {
    private int numberOfFiles = 0;

    @Override
    public void visitTextFile(TextFile f) {
        numberOfFiles++;
    }

    @Override
    public void visitBinaryFile(BinaryFile f) {
        numberOfFiles++;
    }

    public int getResult() {
        return numberOfFiles;
    }
}
