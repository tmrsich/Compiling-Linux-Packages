import java.util.Scanner;
public class Compiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initializes empty strings to store user input
        String userInput = "";
        String inputLines = "";

        // Keeps taking input until "done" is entered
        while (true) {
            System.out.println("Enter a package name, or type 'done' when finished");
            inputLines = input.nextLine().toLowerCase(); // Changes any package names to lower case

            if (inputLines.equals("done")) {
                break; // Exits the while loop when "done" is entered
            }

            userInput += inputLines + " "; // Appends the entered package name
        }

        // Splits the user input into an array of package names
        String[] packageList = userInput.split(" ");

        // Generates and prints the commands for each package
        for (String packageName : packageList) {
            String tarAndCdCommand = ("\ntar -xvf " + packageName + ".tar.xz\n" + "cd " + packageName);
            System.out.println(tarAndCdCommand + "\n");
        }

        // Closes the scanner
        input.close();
    }
}