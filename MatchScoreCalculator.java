public class MatchScoreCalculator {

    public static int calculateMatchScore(Mentor mentor,Mentee mentee) {

        int score = 50;

        if (mentor.getField().equalsIgnoreCase(mentee.getField())) {
            score += 30;
        }

        score += mentor.getYearsExperience();

        if(score > 100) {
            score = 100;
        }

        return score;
    }
}