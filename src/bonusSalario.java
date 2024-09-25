import java.util.Scanner;

public class bonusSalario {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o salário base do funcionário: ");
        double salarioBase = ler.nextDouble();

        System.out.println("Qual o desempenho do funcionário? (1- ótimo, 2- bom, 3- regular)");
        String desempenhoFuncionario = ler.next().toLowerCase();

        double bonus = 0.0;

        switch (desempenhoFuncionario) {
            case "1":
            case "otimo":
            case "ótimo":
                bonus = 0.20;
                break;
            case "2":
            case "bom":
                bonus = 0.10;
                break;
            case "3":
            case "regular":
                bonus = 0.05;
                break;
            default:
                System.out.println("Valor inválido, bônus não adicionado.");
                break;
        }

        double salarioFinal = salarioBase + (salarioBase * bonus);
        System.out.printf("O salário final com bônus é: %.2f%n", salarioFinal);
    }
}
