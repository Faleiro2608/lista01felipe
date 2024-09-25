import java.util.Random;
import java.util.Scanner;

public class jogoCoelhinho {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Número aleatório entre 0 e 100
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;

        System.out.println("Bem-vindo ao Jogo do Coelho!");
        System.out.println("Tente adivinhar o número secreto entre 0 e 100.");
        System.out.println("Você tem " + tentativas + " tentativas.");

        for (int i = 0; i < tentativas; i++) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }

            if (i == tentativas - 1) {
                System.out.println("Você esgotou suas tentativas. O número secreto era: " + numeroSecreto);
            }
        }

        scanner.close();
    }
}
