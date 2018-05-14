package library;

import predicate.*;
import visitor.Visitor;

import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items;

    public ArrayList<Item> getItems(){ return items; }

    public Library() { items = new ArrayList<Item>(); }

    public boolean isEmpty() { return items.isEmpty(); }

    public void add(Item anItem) { items.add(anItem); }

    public int numberOfItems() { return items.size(); }

    public ArrayList<Item> search(Predicate aPredicate) {
        ArrayList<Item> result = new ArrayList<>();
        for(Item item : items) {
            if(aPredicate.match(item)) result.add(item);
        }
        return result;
    }

    public ArrayList<Item> searchByName(String aName) {
        return this.search(new PredicateByName(aName));
    }

    public ArrayList<Item> searchByDate(int aDate) {
        return this.search(new PredicateByDate(aDate));
    }

    public ArrayList<Item> searchByPrefix(String aPrefix) {
        return this.search(new PredicateByPrefix(aPrefix));
    }

    public ArrayList<Item> searchOr(ArrayList<Predicate> predicates) {
        return this.search(new PredicateOr(predicates));
    }

    public ArrayList<Item> searchAnd(ArrayList<Predicate> predicates) {
        return this.search(new PredicateAnd(predicates));
    }

    public void accept(Visitor v) {
        v.visitLibrary(this);
    }
}
