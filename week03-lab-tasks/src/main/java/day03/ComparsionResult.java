package day03;

public enum ComparsionResult {
    UNDEFINED(""),
    LESS("Kisebb mint amit választottam!"),
    EQUAL("Eltalálta!"),
    GREATER("Nagyobb mint amit választottam!");

    private final String description;

    ComparsionResult(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
