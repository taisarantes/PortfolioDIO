public class BreakContinue {
    public static void breakContinue(){
        System.out.println("Break:");

        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                break;

            System.out.println(numero);
        }

        System.out.println("Continue:");

        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}
