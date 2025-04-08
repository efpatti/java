import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Declaração de variáveis
        String name, nameWithoutWhitespaces, firstName, lastName, input, text1, text2;
        int charactersName;
        boolean sussurrar;

        // Iniciando scanner para ler entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Pergunta se o usuário quer sussurrar
        System.out.print("Vai sussurrar? (s/N) ");
        input = sc.nextLine();

        // Transforma em minúsculo e compara com "s"
        sussurrar = input.toLowerCase().equals("s");

        // Recebe o primeiro e o último nome
        System.out.print("First name: ");
        firstName = sc.nextLine();

        System.out.print("Last name: ");
        lastName = sc.nextLine();

        // Fecha o scanner (boa prática!)
        sc.close();

        // Junta os nomes
        name = firstName + " " + lastName;

        // Remove todos os espaços em branco
        nameWithoutWhitespaces = name.replaceAll("\\s", "");

        // Conta quantos caracteres tem sem espaços
        charactersName = nameWithoutWhitespaces.length();

        // Monta os textos com String.format
        text1 = String.format("Your name is %s", name);
        text2 = String.format("Name length is %d", charactersName);

        // Se o usuário quiser sussurrar, deixa tudo em minúsculo
        if (sussurrar) {
            text1 = text1.toLowerCase();
            text2 = text2.toLowerCase();
        }
        // Caso contrário, grita em maiúsculo
        else {
            text1 = text1.toUpperCase();
            text2 = text2.toUpperCase();
        }

        // Mostra os textos finais
        System.out.println(text1);
        System.out.println(text2);
    }
}
