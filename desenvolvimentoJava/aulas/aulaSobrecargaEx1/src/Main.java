public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        //com retorno é possível por os métodos em variáveis
        System.out.println("Exercício retornos");

        double areaQuadrado = Retorno.area(6);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Retorno.area(7,3);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Retorno.area(10,7,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}