import java.util.Scanner;

public class CondComposta {
    public static void caixaEletronico2(){
        Scanner sc = new Scanner(System.in);

        int saldo = 30;
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Digite o valor a ser resgatado: ");
        int valorSolicitado = sc.nextInt();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
            // mais de um comando denro da condiçaõ precisa estar dentro de um bloco
        } else
            System.out.println("Você não possui saldo suficiente :(");
        // só uma linha de comando na condição não precisa estar dentro de um bloco

    }
}
