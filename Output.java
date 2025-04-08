import java.util.Scanner;
public  class Output {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adicionar ");
        System.out.print(" nota! \n");
        String name;
        int age;
        double n1, n2, n3, media;
        System.out.print("Nome do aluno: ");
        name = sc.nextLine();
        System.out.print("Idade do aluno: ");
        age = sc.nextInt();
        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();
        sc.close();
        media = (n1 + n2 + n3) / 3;
        System.out.printf("O aluno %s ficou com a media %.2f%n", name, media);
        
    }
}