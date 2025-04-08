import java.util.Scanner;
public class Constant {
    public static void main(String[]args) {
        /*
         int idade = 10;
         dawdawd
         dawdaw
         dawdaw
         dawdawd
         dawdawda
         dawdawdaw
         dawdwa
         int peso = 50;
         */
        final float pi = 3.14f;
        double base, height, area_triangulo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        base = sc.nextDouble();
        System.out.print("Altura: ");
        height = sc.nextDouble();
        area_triangulo =  (base * height) / 2;
        System.out.println("Isto é uma constante: " + pi);
        System.out.println("A área do triangulo é: " + area_triangulo);
        sc.close();
    }
}
