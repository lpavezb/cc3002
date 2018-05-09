

public class PredicateByName implements Predicate {
    private String nameToMatch;
    public PredicateByName(String aName) {
        nameToMatch = aName;
    }

    @Override
    public boolean match(Item item) {
        return nameToMatch.equals(item.getName());
    }
}
