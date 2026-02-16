import java.util.ArrayList;
import java.util.Scanner;

// Upper Camel Case naming convention
public class Dashboard {
    public static void main(String[] args) throws InterruptedException {
        // Declare
        Scanner inputBuffObj = new Scanner(System.in);
        ArrayList<String> customerFeedbacks = new ArrayList<>();
        boolean mainMenuRunning = true;

        // Input
        while (mainMenuRunning) {
            System.out.print("Please select [1] Feedback & [2] Dashboard & [3] Shutdown: ");
            int userChoice = Integer.parseInt(inputBuffObj.nextLine());

            if (userChoice == 1) {
                System.out.print("Please enter your comment: ");
                customerFeedbacks.add(inputBuffObj.nextLine());
            } else if (userChoice == 2) {
                System.out.println("I have selected 2");
                System.out.print("Please enter your PIN: ");
                int adminPin = Integer.parseInt(inputBuffObj.nextLine());

                if (adminPin == 2468) {
                    System.out.println("Admin PIN is Correct!");
                    for (String currentFeedback: customerFeedbacks) {
                        // Iteration
                        System.out.printf("The feedback is: %s%n", currentFeedback);
                    }
                } else {
                    System.out.println("Admin PIN is incorrect!");
                }

            } else if (userChoice == 3) {
                System.out.println("I have selected 3");
                mainMenuRunning = false;
            }
            else {
                System.out.println("Are you out of your mind ? Select 1 or 0");
                System.out.println("Are you blind or what");
            }
        }
    }
}
