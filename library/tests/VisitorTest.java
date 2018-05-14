

import library.*;
import org.junit.*;
import visitor.GameVisitor;
import visitor.Visitor;

import java.util.*;

import static org.junit.Assert.*;

public class VisitorTest extends AbstractTest{
    @Test
    public void visitGames(){
        Library newLibrary = new Library();
        newLibrary.add(starcraftGame);
        List<Item> expectedResult = newLibrary.getItems();
        GameVisitor v = new GameVisitor();
        library.accept(v);
        assertEquals(expectedResult,v.getGames());
    }
}
