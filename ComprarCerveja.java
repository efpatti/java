import java.util.Scanner;
public class ComprarCerveja {
    public static void main(String[]args) {
        boolean podeComprar, maiorDeIdade, dinheiroSuficiente, temAlgumaCoisa;
        int idade;
        double dinheiro, preco_cerveja = 350;
        String recado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        maiorDeIdade = idade >= 18;
        System.out.print("Seu dinheiro: ");
        dinheiro = sc.nextDouble();
        sc.close();
        dinheiroSuficiente = dinheiro >= preco_cerveja;
        temAlgumaCoisa = dinheiroSuficiente || maiorDeIdade;
        podeComprar = dinheiroSuficiente && maiorDeIdade;
        if (temAlgumaCoisa) {
            recado = podeComprar ? "Voce pode!" : dinheiroSuficiente || !maiorDeIdade ? "Voce nao tem 18" : "Voce nao tem dinheiro";
            System.out.println(recado);
        }
        else {
            System.out.println("Voce nao tem nada!");
        }

   

    }
}