public class ClasseMae {
    void metodo1(){
        System.out.println("Método 1 da Classe Mãe");
    }

    void metodo2(){
        System.out.println("Método 2 da Classe Mãe");
    }
}

class ClasseFilha1 extends ClasseMae{
    @Override
    void metodo1(){
        System.out.println("Método 1 da Classe Filha 1");
    }
}

class ClasseFilha2 extends ClasseMae{
    @Override
    void metodo1(){
        System.out.println("Método 1 da Classe Filha 2");
    }

    @Override
    void metodo2(){
        System.out.println("Método 1 da Classe Filha 2");
    }
}