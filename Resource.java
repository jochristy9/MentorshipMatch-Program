public class Resource {

    private String title;
    private String description;
    private String website;

    public Resource(String title, String description, String website) {
        this.title = title;
        this.description = description;
        this.website = website;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getWebsite() {
        return website;
    }

    public void displayResource() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Website: " + website);
        System.out.println();
    }
}