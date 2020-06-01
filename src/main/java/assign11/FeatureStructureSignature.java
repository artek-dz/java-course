package assign11;

import java.util.HashMap;
import java.util.Map;

public class FeatureStructureSignature {
    private Map<FeatureName, FeatureSignature> signatures;

    private FeatureStructureSignature(Map<FeatureName, FeatureSignature> signatures) {
        this.signatures = signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Map<FeatureName, FeatureSignature> signatures = new HashMap<>();

        public Builder() {

        }

        public Builder withFeatureDomain(String name, String... values) {
            this.signatures.put(FeatureName.with(name), FeatureSignature.withDomain(values));
            return this;
        }

        public Builder withFeatureScheme(String name, String... names) {
            this.signatures.put(FeatureName.with(name), FeatureSignature.withScheme(names));
            return this;
        }

        public FeatureStructureSignature build() {
            return new FeatureStructureSignature(this.signatures);
        }
    }

}
