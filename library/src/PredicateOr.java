import java.util.ArrayList;

public class PredicateOr extends AbstractBinaryPredicate  {
    public PredicateOr(ArrayList<Predicate> aLotOfPredicates){ super(aLotOfPredicates); }

    @Override
    public boolean match(Item item) {
        for (Predicate predicate : predicates)
            if(predicate.match(item))
                return true;
        return false;
    }
}
