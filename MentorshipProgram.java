import java.util.ArrayList;

public class MentorshipProgram {

    private ArrayList<User> participants;
    private ArrayList<Resource> resources;

    public MentorshipProgram() {
        participants = new ArrayList<>();
        resources = new ArrayList<>();
    }

    public void addParticipant(User user) {
        participants.add(user);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void displayParticipants() {
        for(User user : participants) {
            user.displayRole();
        }
    }
}