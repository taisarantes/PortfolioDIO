import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um exercício: ");
        System.out.println("1 - Calculadora \n2 - Mensagem Educada \n3 - Calculo de Empréstimo\n item: ");
        int item = sc.nextInt();


            switch (item) {
                case 1 -> Calculadora.operacoes();
                case 2 -> Mensagem.horario();
                case 3 -> Emprestimo.calcular(1250, Emprestimo.getDuasParcelas());
                default -> System.out.println("Item invalido.");
            }

    }
}
