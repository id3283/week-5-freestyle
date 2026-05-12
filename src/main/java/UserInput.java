import java.util.Scanner;

public class UserInput {
    private UserInput() {
    }

    private static Scanner scanner = new Scanner(System.in);

    public static double promptForDouble(String prompt) {
        System.out.println(prompt);

        while(true) {
            String userInput = scanner.nextLine();
            try {
                double result = Double.parseDouble(userInput);
                return result;
            }
            catch (NumberFormatException nfe) {
                System.err.println("You can't buy a house with that input.  Try again.");
            }
        }
    }


}
