package predicate;

import library.Item;

public class PredicateByDate implements Predicate {
    private int dateToMatch;
    public PredicateByDate(int aDate) {
        dateToMatch = aDate;
    }

    @Override
    public boolean match(Item item) {
        return dateToMatch == item.getYear();
    }
}
