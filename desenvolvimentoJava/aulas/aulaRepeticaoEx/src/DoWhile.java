import java.util.Random;

public class DoWhile {
    public static void ligacao(){
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        //valores aleatorios entre 1 e 3               se o valor for 1, significa que ele atendeu
        // entre 1 e 3 para ter um range maior de vezes que o numero pode ser false
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
        //return new Random().nextInt(3)!=1;
        //negando o ato de continuar tocando
        //se ele atendeu, ele para de tocar, por isso o !
    }
}

