package hillel;

public enum UserTypes {
    ADMIN(0), // the highest
    PREMIUM(1), // high
    AUTHORIZED(2), // normal
    GUEST(3); // low

    private int priority;
    private UserTypes(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return this.priority;
    }
}
