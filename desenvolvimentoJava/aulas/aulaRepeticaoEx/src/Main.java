import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um exercício: ");
        System.out.println("1 - For \n2 - For em Arrays \n3 - For Each\n4 - Break e Continue \n5 - While \n6 - Do While \nitem: ");
        int item = sc.nextInt();


        switch (item) {
            case 1 -> For.dormir();
            case 2 -> ForArrays.alunos();
            case 3 -> ForArrays.alunos2();
            case 4 -> BreakContinue.breakContinue();
            case 5 -> While.compras();
            case 6 -> DoWhile.ligacao();
            default -> System.out.println("Item invalido.");
        }

    }
}