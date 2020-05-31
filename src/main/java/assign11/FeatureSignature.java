package assign11;

import java.util.*;

public final class FeatureSignature {
    private boolean atomic;
    private Set<AtomicValue> domain;
    private Set<Feature.Name> scheme;

    private FeatureSignature(boolean atomic, Set<AtomicValue> domain, Set<Feature.Name> scheme) {
        this.atomic = atomic;
        this.domain = domain;
        this.scheme = scheme;
    }

    public static FeatureSignature withDomain(String... values) {
        Set<AtomicValue> domain = new HashSet<>();
        for (String value : values) {
            domain.add(AtomicValue.with(value));
        }
        return new FeatureSignature(true,domain,Set.of());
    }

    public static FeatureSignature withScheme(String... names) {
        Set<Feature.Name> scheme = new HashSet<>();
        for (String name : names) {
            scheme.add(Feature.Name.with(name));
        }
        return new FeatureSignature(false,Set.of(),scheme);
    }

    public boolean isAtomic() {
        return atomic;
    }

    public Set<AtomicValue> getDomain() {
        return domain;
    }

    public Set<Feature.Name> getScheme() {
        return scheme;
    }
}
