public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Create Mentor");
            System.out.println("2. Create Mentee");
            System.out.println("3. Exit");

            choice = scnr.nextInt();

        } while(choice != 3);

        scnr.close();
    }
}