package methods;

public enum StringMethod {
    PLUCK("Pluck"),
    FIDDLE("Fiddle");

    private final String method;

    StringMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
