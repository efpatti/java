import java.util.Scanner;
import java.util.InputMismatchException;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adicionar ");
        System.out.print(" nota! \n");

        String name;
        int age = 0;
        double n1 = 0, n2 = 0, n3 = 0, media;

        // Nome
        System.out.print("Nome do aluno: ");
        name = sc.nextLine();

        // Idade com validação
        while (true) {
            System.out.print("Idade do aluno: ");
            try {
                age = sc.nextInt();
                if (age < 0 || age > 150) {
                    System.out.println("Idade inválida. Tente novamente.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro válido!");
                sc.next(); // Limpa o buffer
            }
        }

        // Notas com validação
        n1 = getValidGrade(sc, 1);
        n2 = getValidGrade(sc, 2);
        n3 = getValidGrade(sc, 3);

        sc.close();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("O aluno %s, de %d anos ficou com a média %.2f%n", name, age, media);
    }

    public static double getValidGrade(Scanner sc, int num) {
        double grade = 0;
        while (true) {
            System.out.printf("Nota %d: ", num);
            try {
                grade = sc.nextDouble();
                if (grade < 0 || grade > 10) {
                    System.out.println("Nota deve estar entre 0 e 10.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número decimal válido!");
                sc.next(); // Limpa o buffer
            }
        }
        return grade;
    }
}
