public class Main {
    public static void main(String[] args) {
        //inicializa um objeto
        Carro carro1 = new Carro();

        //seta valores para os atributos da classe carro a partir do objeto carro1
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setTanque(59);

        //pega os valores do objeto carro1 e printa eles
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do tanque: " + carro1.getTanque());
        System.out.println("Valor necessário para encher o tanque: " + carro1.totalvalorGasolina(6.39));

        //outra forma de dar valor ao objeto:
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println("\nModelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do tanque: " + carro2.getTanque());
        System.out.println("Valor necessário para encher o tanque: " + carro2.totalvalorGasolina(6.39));

    }
}