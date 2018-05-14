package system;

import visitor.*;

public class FileSystem {
    private Directory root;

    public FileSystem() {
        root = new Directory("root");
    }

    public void add(Item item) {
        root.add(item);
    }

    public int getSize() {
        return root.getSize();
    }

    public int getNumberOfFiles() {
        NumberOfFileVisitor v = new NumberOfFileVisitor();
        root.accept(v);
        return v.getResult();
    }

    public int getNumberOfDirectory() {
        NumberOfDirectoryVisitor v = new NumberOfDirectoryVisitor();
        root.accept(v);
        return v.getResult();
    }

    public String listing() {
        ListingVisitor v = new ListingVisitor();
        root.accept(v);
        return v.getResult();
    }
}
