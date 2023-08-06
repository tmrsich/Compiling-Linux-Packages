import java.util.Scanner;
public class Compiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Takes user input
        System.out.println("Enter the list of packages separated by a space");
        String userInput = input.nextLine().toLowerCase();

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