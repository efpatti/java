import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        byte day;
        Scanner sc = new Scanner(System.in);

       
        do {

        System.out.print("Digite um dia de 1 a 7: ");
        day = sc.nextByte();

        if (day < 1 || day > 7) {
            System.out.println("Número inválido");
        }

        }
        while (day < 1 || day > 7); 
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
    }

           
        sc.close();
    }
}
