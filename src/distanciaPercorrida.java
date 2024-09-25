import java.util.Scanner;

public class distanciaPercorrida {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite a distância percorrida em Metros: ");
        double distanciaPercorrida = ler.nextDouble();

        System.out.println("Digite o tempo gasto em Segundos: ");
        double tempoSegundos = ler.nextDouble();

        double velocidadeMedia = distanciaPercorrida / tempoSegundos;

        if (velocidadeMedia < 5) {
            System.out.println("Movimento Lento.");
        }//fim if
        else if (velocidadeMedia >= 5 & velocidadeMedia <= 15) {
            System.out.println("Movimento moderado.");
        }//fim elseif
        else{
            System.out.println("Movimento rápido.");
        }//fim else
    }//fim class
}//fim main