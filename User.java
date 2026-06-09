public abstract class User {
    private String name;
    private String field;

    public User(String name, String field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public abstract void displayRole();
}