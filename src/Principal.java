import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sentimentos meusSentimentos = new Sentimentos();

        System.out.println("O que você está sentindo agora?");
        System.out.println("- Felicidade");
        System.out.println("- Tristeza");
        System.out.println("- Raiva");
        System.out.println("- Medo");
        System.out.println("- Nojo");
        System.out.println("- Surpresa");
        System.out.println("- Amor");
        System.out.println("- Culpa");
        System.out.println("- Vergonha");
        System.out.println("- Ansiedade");
        System.out.println("Escreva o que está sentindo: ");

        String sentimentoDigitado = scanner.nextLine();

        String resposta = meusSentimentos.obterPassagem(sentimentoDigitado);

        System.out.println("\nSeparei esta mensagem especialmente para o seu coração: ");
        System.out.println(resposta);

        scanner.close();
    }
}
