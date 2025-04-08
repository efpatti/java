import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // Variable declaration
        String name, nameWithoutWhitespaces, firstName, lastName, input, text1, text2;
        int charactersName;
        boolean whisper;

        // Initiating scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user if they want to whisper
        System.out.print("Will you whisper? (s/N) ");
        input = sc.nextLine();

        // Convert input to lowercase and compare with "s"
        whisper = input.toLowerCase().equals("s");

        // Get the first and last name
        System.out.print("First name: ");
        firstName = sc.nextLine();

        System.out.print("Last name: ");
        lastName = sc.nextLine();

        // Close the scanner (best practice!)
        sc.close();

        // Concatenate the names
        name = firstName + " " + lastName;

        // Remove all whitespaces
        nameWithoutWhitespaces = name.replaceAll("\\s", "");

        // Count character length without whitespace
        charactersName = nameWithoutWhitespaces.length();

        //  Format strings with variables using String.format
        text1 = String.format("Your name is %s", name);
        text2 = String.format("Name length is %d", charactersName);

        // If user wants to whisper, convert text to lowercase 
        if (whisper) {
            text1 = text1.toLowerCase();
            text2 = text2.toLowerCase();
        }

        // Otherwise, convert text to uppercase
        else {
            text1 = text1.toUpperCase();
            text2 = text2.toUpperCase();
        }

        // Print the final texts
        System.out.println(text1);
        System.out.println(text2);
    }
}
