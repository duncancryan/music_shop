package behaviours;

public enum PercussionMethod {
    STRIKE("Strike"),
    SHAKE("Shake"),
    SCRAPE("Scrape");

    private final String method;

    PercussionMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
