import java.util.Scanner;
public class OperadoresLogicos {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        boolean diferente;
        int n1, n2;
        System.out.print("Número 1: ");
        n1 = sc.nextInt();
        System.out.print("Número 2: ");
        n2 = sc.nextInt();
        diferente = n1 != n2;
        sc.close();
        if (diferente) {
            if(n1 > n2) {
                System.out.println("O número 1 é maior!");
            } 
            else {
                System.out.println("O número 2 é maior!");
            }
        }
        else {
            System.out.println("Os números são iguais!");
        }
    }
}