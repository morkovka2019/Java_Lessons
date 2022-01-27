package hillel;

public enum UserTypes {
    ADMIN(1),
    PREMIUM(2),
    AUTHORIZED(3),
    GUEST(0);

    private int priority;
    private UserTypes(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return this.priority;
    }
}
