import java.util.Scanner;
public class Strings {
    public static void main(String[]args) {
        String name, nameWithoutWhitespaces, firstName, lastName;
        int charactersName;
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        firstName = sc.nextLine();
        System.out.print("Last name: ");
        lastName = sc.nextLine();
        sc.close();
        name = firstName + " " + lastName;
        nameWithoutWhitespaces = name.replaceAll("\\s", "");
        charactersName = nameWithoutWhitespaces.length();
        System.out.println("Your name is " + name);
        System.out.println("Name length: " + charactersName);
    }
}