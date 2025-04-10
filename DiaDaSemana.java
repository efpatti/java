import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[]args) {
        byte day;
        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite um número entre 1 e 7: ");
            day = sc.nextByte();

            if (day < 1 || day > 7) {
                System.out.println("Digite um número válido!");
            }
        }
        while (day < 1 || day > 7);
        System.out.println(days[day - 1]);
        sc.close();
    }
}