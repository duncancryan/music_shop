package enums;

public enum StringMethod {
    PLUCK("Pluck"),
    STRUM("Strum"),
    FIDDLE("Fiddle");

    private final String method;

    StringMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
