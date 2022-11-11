public class Heranca {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast
//        Vendedor vendedor1 = (Vendedor) new Funcionario();
        //dá erro de ClassCastException
        //as subclasses possuem informações que não estão nas classes mães
        //então, com o downcast, a informação vai ser perdida
        //é como double -> int
    }
}


