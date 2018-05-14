import library.Book;
import library.Game;
import library.Library;
import org.junit.Before;

public class AbstractTest {
    Library emptyLibrary;
    Library library;
    Book starcraftBook;
    Game starcraftGame;

    @Before
    public void setUp() {
        emptyLibrary = new Library();
        library = new Library();
        starcraftBook = new Book("Starcraft", 2000);
        starcraftGame = new Game("Starcraft", 2000);

        library.add(new Book("Le tueur", 2002));
        library.add(starcraftBook);
        library.add(starcraftGame);
    }
}
