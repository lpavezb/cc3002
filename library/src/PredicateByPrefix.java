

public class PredicateByPrefix implements Predicate {
    public String prefix;
    public PredicateByPrefix(String aPrefix) {
        prefix = aPrefix;
    }

    @Override
    public boolean match(Item item) {
        return item.getName().startsWith(prefix);
    }
}
