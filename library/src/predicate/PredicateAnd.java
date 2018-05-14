package predicate;

import library.Item;

import java.util.ArrayList;

public class PredicateAnd extends AbstractBinaryPredicate {

    public PredicateAnd(ArrayList<Predicate> aLotOfPredicates) { super(aLotOfPredicates); }

    @Override
    public boolean match(Item item) {
        for (Predicate predicate : predicates)
            if(!predicate.match(item))
                return false;
        return true;
    }
}
