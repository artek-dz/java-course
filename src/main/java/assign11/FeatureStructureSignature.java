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
    }

}
