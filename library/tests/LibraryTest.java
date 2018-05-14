

import library.*;
import org.junit.*;
import predicate.*;

import java.util.*;

import static org.junit.Assert.*;

public class LibraryTest extends AbstractTest{

    @Test
    public void isEmpty() {
        assertTrue(emptyLibrary.isEmpty());
    }

    @Test
    public void libraryWithOneItem() {
        Item book = new Book("Betelgeuse", 2005);
        emptyLibrary.add(book);
        assertFalse(emptyLibrary.isEmpty());
    }

    @Test
    public void numberOfItems() {
        assertEquals(emptyLibrary.numberOfItems(), 0);
        assertEquals(library.numberOfItems(), 3);
    }

    @Test
    public void searchingInLibrary() {
        List<Item> result = library.searchByName("AI");
        assertTrue(result.isEmpty());
    }

    @Test
    public void searching(){
        List<Item> result = library.searchByName("Starcraft");
        assertEquals(result.size(), 2);
        assertEquals(result.get(0), starcraftBook);
        assertEquals(result.get(1), starcraftGame);

        assertEquals(library.searchByName("NotFound").size(), 0);
    }

    @Test
    public void searchingByDate() {
        List<Item> expectedResult = library.searchByName("Starcraft");
        List<Item> result = library.searchByDate(2000);
        assertEquals(expectedResult, result);
    }

    @Test
    public void searchingByPrefix() {
        List<Item> expectedResult = library.searchByName("Starcraft");
        List<Item> result = library.searchByPrefix("Star");
        assertEquals(expectedResult, result);
    }

    @Test
    public void searchingOr() {
        ArrayList<Item> expectedResult = library.searchByName("Starcraft");
        expectedResult.addAll(library.searchByName("Le tueur"));
        ArrayList<Predicate> res = new ArrayList<>();
        res.add(new PredicateByName("Starcraft"));
        res.add(new PredicateByName("Le tueur"));
        List<Item> result = library.searchOr(res);
        for (Item item : result)
            assertTrue(expectedResult.contains(item));
        assertEquals(expectedResult.size(), result.size());
    }

    @Test
    public void searchingAnd() {
        ArrayList<Item> expectedResult = library.searchByName("Starcraft");
        ArrayList<Predicate> res = new ArrayList<>();
        res.add(new PredicateByName("Starcraft"));
        res.add(new PredicateByDate(2000));
        List<Item> result = library.searchAnd(res);
        for (Item item : result)
            assertTrue(expectedResult.contains(item));
        assertEquals(expectedResult.size(), result.size());
    }
}
