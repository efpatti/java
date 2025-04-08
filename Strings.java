import java.util.Scanner;
public class Strings {
    public static void main(String[]args) {
        String name, nameWithoutWhitespaces, firstName, lastName, input, text1 = "your name is ", text2 = "name length is ";
        int charactersName;
        boolean sussurrar;

        Scanner sc = new Scanner(System.in);
        System.out.print("Vai sussurrar? (s/N) ");
        input = sc.nextLine();
        sussurrar = input.toLowerCase().equals("s");
        if (sussurrar) {
            text1 = text1.toLowerCase();
            text2 = text2.toLowerCase();
        }
        else {
            text1 = text1.toUpperCase();
            text2 = text2.toUpperCase();
        }
        System.out.print("First name: ");
        firstName = sc.nextLine();
        System.out.print("Last name: ");
        lastName = sc.nextLine();
        sc.close();
        name = firstName + " " + lastName;
        nameWithoutWhitespaces = name.replaceAll("\\s", "");
        charactersName = nameWithoutWhitespaces.length();
        System.out.println(text1 + name);
        System.out.println(text2 + charactersName);
    }
}