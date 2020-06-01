package assign11;

import java.util.*;

import static java.util.Collections.emptySet;

public class FeatureSignature {
    private boolean atomic;
    private Set<AtomicValue> domain;
    private Set<FeatureName> scheme;

    private FeatureSignature(boolean atomic, Set<AtomicValue> domain, Set<FeatureName> scheme) {
        this.atomic = atomic;
        this.domain = domain;
        this.scheme = scheme;
    }

    public static FeatureSignature withDomain(String... values) {
        Set<AtomicValue> domain = new HashSet<>();
        for (String value : values) {
            domain.add(AtomicValue.with(value));
        }
        return new FeatureSignature(true,domain,emptySet());
    }

    public static FeatureSignature withScheme(String... names) {
        Set<FeatureName> scheme = new HashSet<>();
        for (String name : names) {
            scheme.add(FeatureName.with(name));
        }
        return new FeatureSignature(false,emptySet(),scheme);
    }

    public boolean isAtomic() {
        return this.atomic;
    }

    public Set<AtomicValue> getDomain() {
        return this.domain;
    }

    public Set<FeatureName> getScheme() {
        return this.scheme;
    }
}
