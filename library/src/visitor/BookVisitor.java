package visitor;

import library.*;

import java.util.ArrayList;

public class BookVisitor extends Visitor{
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void visitBook(Book book){ books.add(book); }

    public ArrayList<Book> getBooks(){ return books; }
}
