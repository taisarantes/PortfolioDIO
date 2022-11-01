import java.util.Scanner;

public class CondSimples {
    public static void caixaEletronico(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo: ");
        int saldo = sc.nextInt();
        System.out.println("Digite o valor a ser resgatado: ");
        int valorSolicitado = sc.nextInt();

        if(saldo > valorSolicitado)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
