import java.util.HashSet;

final class BiasFinder {

    private static final BiasFinder INSTANCE = new BiasFinder();
    private HashSet<String> conservativeSources = new HashSet<>();
    private HashSet<String> liberalSources = new HashSet<>();

    private BiasFinder() {
        conservativeSources.add("Fox");
        conservativeSources.add("Blaze");
        conservativeSources.add("Breitbart");

        liberalSources.add("NY");
        liberalSources.add("WSJ");
        liberalSources.add("CNN");
        liberalSources.add("MSNBC");
    }

    static BiasFinder getInstance() {
        return INSTANCE;
    }

    Bias findBias(String source) {
        if(conservativeSources.contains(source)) {
            return Bias.CONSERVATIVE;
        }
        else if(liberalSources.contains(source)) {
            return Bias.LIBERAL;
        }
        else {
            return Bias.UNKNOWN;
        }
    }

}
