package predicate;

import java.util.ArrayList;

public abstract class AbstractBinaryPredicate implements Predicate{
    ArrayList<Predicate> predicates;

    public AbstractBinaryPredicate(ArrayList<Predicate> aLotOfPredicates){ predicates = aLotOfPredicates; }
}
