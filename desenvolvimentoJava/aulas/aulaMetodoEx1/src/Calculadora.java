import java.util.Scanner;

public class Calculadora {

    public static void operacoes(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();

        double soma = a + b;
        double subt = a - b;
        double mult = a * b;
        double divi = a / b;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subt);
        System.out.println("A multiplicação dos números é: " + mult);
        System.out.println("A divisão dos números é: " + divi);

    }
}
