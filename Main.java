public class Main {

    public static void main(String[] args) {

        MentorshipProgram program = new MentorshipProgram();

        Mentor mentor1 = new Mentor("Sarah Johnson", "Computer Science", 10);
        Mentor mentor2 = new Mentor("David Lee", "Engineering", 7);

        Mentee mentee1 = new Mentee("Alex Smith", "Computer Science", "Software Engineer");
        Mentee mentee2 = new Mentee("Maria Garcia", "Engineering", "Mechanical Engineer");

        program.addParticipant(mentor1);
        program.addParticipant(mentor2);
        program.addParticipant(mentee1);
        program.addParticipant(mentee2);

        System.out.println("=================================");
        System.out.println("      Mentorship Match System");
        System.out.println("=================================");

        System.out.println("\nRegistered Participants:");
        program.displayParticipants();

        System.out.println("\nMentor Information:");
        System.out.println(mentor1.getName() + " - " + mentor1.getField() + " - " + mentor1.getYearsExperience() + " years experience");
        System.out.println("\nMentee Information:");
        System.out.println(mentee1.getName() + " - Goal: " + mentee1.getCareerGoal());
        int score1 = MatchScoreCalculator.calculateMatchScore(mentor1, mentee1);
        
        System.out.println("\nMentor Information:");
        System.out.println(mentor2.getName() + " - " + mentor2.getField() + " - " + mentor2.getYearsExperience() + " years experience");
        System.out.println("\nMentee Information:");
        System.out.println(mentee2.getName() + " - Goal: " + mentee2.getCareerGoal());
        int score2 = MatchCalculator.calculateMatchScore(mentor2, mentee2);
    	System.out.println("\nMatch Score: " + score + "%");
        
        Resource resource1 = new Resource("Resume Builder Workshop", "Learn how to create a professional resume.", "www.futurecareershub.org");

        Resource resource2 = new Resource("Women in STEM Scholarship","Financial assistance for students pursuing STEM degrees.","www.stemscholarsfund.org");

        resource1.displayResource();
        resource2.displayResource();

        System.out.println("\nThank you for using Mentorship Match!");
    }
}