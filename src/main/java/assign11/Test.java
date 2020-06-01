package assign11;

public class Test {

    public static void main(String[] args) {
        FeatureStructure fs = FeatureStructure.builder()
                .withFeature("CAT", "s")
                .withFeature("NUMB", "sg")
                .withFeature("PERS", "3rd")
                .withScheme("AGR", 0, "PERS", "NUMB")
                .withScheme("SUBJ", "AGR")
                .withScheme("HEAD", "SUBJ", "AGR")
                .build();
        //fs http://cs.union.edu/~striegnk/courses/nlp-with-prolog/html/node81.html#l11.sec.fs
        System.out.println(fs.toString());
        //set of features in fs
        System.out.println(fs.features());

    }
}
