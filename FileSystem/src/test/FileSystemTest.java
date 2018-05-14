

import system.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileSystemTest {
    private FileSystem emptyFs, fs;
    private Directory d1;
    private Directory d2;

    @Before
    public void setUp() {
        emptyFs = new FileSystem();

        d1 = new Directory("d1");
        d2 = new Directory("d2");
        d1.add(d2);
        d1.add(new TextFile("file.txt", "hello world!"));

        byte[] c = {'1', 'c'};
        d1.add(new BinaryFile("file.obj", c));

        fs = new FileSystem();
        fs.add(d1);
    }

    @Test
    public void testGetSize() {
        assertEquals(0, emptyFs.getSize());
        assertEquals(14, fs.getSize());
    }

    @Test
    public void testGetNumberOfFile() {
        assertEquals(0, emptyFs.getNumberOfFiles());

        assertEquals(2, fs.getNumberOfFiles());

        TextFile aFile = new TextFile("tmp.txt", "a file system example");
        Directory d = new Directory("another directory");
        d.add(aFile);
        fs.add(d);
        assertEquals(3, fs.getNumberOfFiles());
    }

    @Test
    public void testGetNumberOfDirectory() {
        assertEquals(1, emptyFs.getNumberOfDirectory());

        assertEquals(3, fs.getNumberOfDirectory());

        TextFile aFile = new TextFile("tmp.txt", "a file system example");
        Directory d = new Directory("another directory");
        d.add(aFile);
        fs.add(d);
        assertEquals(4, fs.getNumberOfDirectory());
    }

    @Test
    public void testListing() {
        String result = "root\n";
        assertEquals(result, emptyFs.listing());

        result = "root\nd1\nd2\nfile.txt\nfile.obj\n";
        assertEquals(result, fs.listing());
    }
}
