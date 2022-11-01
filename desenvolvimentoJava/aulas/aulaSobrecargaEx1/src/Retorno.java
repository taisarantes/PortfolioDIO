public class Retorno {
    public static double area(double ld) {

        return ld * ld;
    }

    public static double area(double ld1, double ld2) {

        return ld1 * ld2;
    }

    public static double area(double baseMa, double baseMe, double alt) {

        return ((baseMa+baseMe)*alt) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }
}


