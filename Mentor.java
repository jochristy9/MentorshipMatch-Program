public class Mentor extends User {
    private int yearsExperience;

    public Mentor(String name, String field, int yearsExperience) {
        super(name, field);
        this.yearsExperience = yearsExperience;
    }

    @Override
    public void displayRole() {
        System.out.println("Mentor: " + getName());
    }

    public int getYearsExperience() {
        return yearsExperience;
    }
}