import java.util.Scanner;

public class lerHora {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informar Horário Comercial 0-24h");
        System.out.println();

        System.out.print("Digite a hora Inicial: ");
        int horaInicial = ler.nextInt();
        System.out.print("Digite a hora Final: ");
        int horaFinal = ler.nextInt();
        System.out.print("Digite a hora atual: ");
        int horaAtual = ler.nextInt();

        if (horaInicial >= horaFinal) {
            System.out.println("Erro: O horário inicial deve ser menor que o horário final.");
        } else {
            if (horaAtual >= horaInicial & horaAtual < horaFinal) {
                System.out.println("Dentro do horário comercial.");
            }//fim if
                else if (horaAtual < horaInicial) {
                    System.out.println("Hora comercial ainda não começou");
                }//fim elseif
                else{
                    System.out.println("Hora comercial já terminou");
                    
            }//fim else
        }//fim else
    }//fim main
}//fim class
