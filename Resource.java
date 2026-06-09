public abstract class Resource {

    private String title;

    public Resource(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void displayResource();
}