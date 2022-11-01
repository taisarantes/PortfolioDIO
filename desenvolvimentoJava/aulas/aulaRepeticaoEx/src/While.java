import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void compras(){
        double mesada = 50.0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            //essa parte do código é para o valor da mesada não ficar negativo

            System.out.println("Doce de valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    //retorna um double com a classe ThreadLocalRandom para sortear um numero entre 2 e 8

}
