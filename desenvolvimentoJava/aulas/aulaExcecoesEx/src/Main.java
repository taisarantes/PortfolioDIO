import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        catch(InputMismatchException e){
            //para conseguir esse InputMismatchException é preciso rodar o código e forçar erros no código
            //se colocar um texto em uma parte que deveria ser numérico, ele vai mostrar a exceção e o tipo dela
            //que é esse InputMismatchException
            System.out.println("O campo idade precisa ser numérico.");
            //System.err.println("O campo idade precisa ser numérico."); --> outra forma de escrever
        }
    }
}