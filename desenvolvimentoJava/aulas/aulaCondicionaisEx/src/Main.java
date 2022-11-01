import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um exercício: ");
        System.out.println("1 - Condicional Simples \n2 - Condicional Compsota \n3 - Condicional Encadeada \n4 - Condicional Ternária \n5 - Condicional Ternária Composta \nitem: ");
        int item = sc.nextInt();


        switch (item) {
            case 1 -> CondSimples.caixaEletronico();
            case 2 -> CondComposta.caixaEletronico2();
            case 3 -> CondEncadeada.resultadoEscolar();
            case 4 -> CondTernaria.resultadoEscolar2();
            case 5 -> CondTernaria.resultadoEscolar3();
            default -> System.out.println("Item invalido.");
        }

    }
}