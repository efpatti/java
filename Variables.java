// Exemplo simples de uso de variáveis e estruturas condicionais em Java
// Código feito para fins educacionais

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Você gosta de Java? (y/N): ");
        String input = sc.nextLine();

        // Verifica se o usuário digitou alguma coisa
        char resposta = input.isEmpty() ? 'n' : input.charAt(0);

        boolean gostaDeJava = (resposta == 'y' || resposta == 'Y');

        if (gostaDeJava) {
            System.out.println("Que bom saber que você curte Java, " + nome + "!");
        } else {
            System.out.println("Tudo bem, " + nome + ", quem sabe um dia você muda de ideia!");
        }

        sc.close();
    }
}
