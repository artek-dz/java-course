package assign11;

import java.util.*;

public class FeatureStructure implements FeatureValue {
    private int coindex;
    private Map<FeatureName, FeatureValue> features;

    private FeatureStructure(int coindex, Map<FeatureName, FeatureValue> features) {
        this.coindex = (coindex < 0 ? -1 : coindex);
        this.features = features;
    }

    @Override
    public int getCoindex() {
        return this.coindex;
    }

    @Override
    public String toString() {
        return (coindex < 0 ? "" : "(" + coindex + ")") + features.toString()
                .replace("{", "[ ")
                .replace("}", " ]")
                .replace("=", " : ");
    }

    public Set<Feature> features() {
        Set<Feature> featureSet = new HashSet<>();
        Iterator<Map.Entry<FeatureName, FeatureValue>> iterator = features.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<FeatureName, FeatureValue> entry = iterator.next();
            featureSet.add(Feature.with(entry.getKey().getName(), entry.getValue()));
        }
        return featureSet;
    }

    public static Builder builder() {
        return new FeatureStructure.Builder();
    }

    public static class Builder {
        private Map<FeatureName, FeatureValue> features = new HashMap<>();
        private Map<FeatureName, ValueReentry> reentries = new HashMap<>();

        public Builder withReentry(String name, int coindex) {
            if (coindex > -1) this.reentries.put(FeatureName.with(name), ValueReentry.with(coindex));
            return this;
        }

        public Builder withFeature(String name, String value) {
            return withFeature(name, -1, value);
        }

        public Builder withFeature(String name, int coindex, String value) {
            this.features.put(FeatureName.with(name), AtomicValue.with(coindex, value));
            if (coindex > -1) this.reentries.put(FeatureName.with(name), ValueReentry.with(coindex));
            return this;
        }

        public Builder withScheme(String name, String... names) {
            return withScheme(name, -1, names);
        }

        public Builder withScheme(String name, int coindex, String... names) {
            Map<FeatureName, FeatureValue> fs = new HashMap<>();
            for (String n : names) {
                if (this.reentries.containsKey(FeatureName.with(n))) {
                    fs.put(FeatureName.with(n), this.reentries.remove(FeatureName.with(n)));
                } else {
                    fs.put(FeatureName.with(n), this.features.remove(FeatureName.with(n)));
                }
            }
            if (coindex > -1) this.reentries.put(FeatureName.with(name), ValueReentry.with(coindex));
            this.features.put(FeatureName.with(name), new FeatureStructure(coindex, fs));
            return this;
        }

        public FeatureStructure build() {
            return new FeatureStructure(-1, this.features);
        }

    }
}
