import java.util.Scanner;

public class CondEncadeada {
    public static void resultadoEscolar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
    }
}
