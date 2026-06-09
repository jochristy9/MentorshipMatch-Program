public class Mentee extends User {
    private String careerGoal;

    public Mentee(String name, String field, String careerGoal) {
        super(name, field);
        this.careerGoal = careerGoal;
    }

    @Override
    public void displayRole() {
        System.out.println("Mentee: " + getName());
    }

    public String getCareerGoal() {
        return careerGoal;
    }
}