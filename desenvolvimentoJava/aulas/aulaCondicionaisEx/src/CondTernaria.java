import java.util.Scanner;

public class CondTernaria {
    public static void resultadoEscolar2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        //                 if nota >= 7           else

        System.out.println(resultado);
    }

    public static void resultadoEscolar3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();
        String resultado = nota >= 7 ? "Aprovado" : nota >=4 && nota < 7 ? "Recuperação" : "Reprovado";
        //                 if nota >= 7           else if                                else "Reprovado"

        System.out.println(resultado);
    }
}
