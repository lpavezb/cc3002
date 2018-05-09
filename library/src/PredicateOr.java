import java.util.ArrayList;

public class PredicateOr implements Predicate  {
    ArrayList<Predicate> predicates;
    public PredicateOr(ArrayList<Predicate> aLotOfPredicates){ predicates = aLotOfPredicates; }

    @Override
    public boolean match(Item item) {
        boolean res = false;
        for (Predicate pred : predicates)
            res = res || pred.match(item);
        return res;
    }
}
