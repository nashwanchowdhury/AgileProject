import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    private static final ArrayList<User> allUsers = new ArrayList<>();

    public static void main(String[] args) {
        allUsers.add(new User("Manager", 12345));
        allUsers.add(new User("Recruit", 678910));
        boolean start = true;
        while (start) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello, Welcome to the Restaurant Management System");
            System.out.println("Please enter your username: ");
            String usernameinput = scanner.nextLine();
            System.out.println("Please enter your password: ");
            int passwordinput = Integer.parseInt(scanner.nextLine());
            while (usernameinput.equals("Manager") && passwordinput == 12345) {
                mainmenu();

            }
            while (usernameinput.equals("Recruit") && passwordinput == 678910) {
                mainmenu2();
            }

        }


    }

    private static void mainmenu() {

    }
    private static void mainmenu2() {

    }


}
