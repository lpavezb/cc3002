import java.util.ArrayList;

public class PredicateAnd implements Predicate {
    ArrayList<Predicate> predicates;
    public PredicateAnd(ArrayList<Predicate> aLotOfPredicates) { predicates = aLotOfPredicates; }

    @Override
    public boolean match(Item item) {
        boolean res = true;
        for (Predicate pred : predicates)
            res = res && pred.match(item);
        return res;
    }
}
