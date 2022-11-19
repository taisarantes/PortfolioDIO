public class Main {
    public static void main(String[] args) {
        Cliente tais = new Cliente();
        tais.setNome("Tais");

        Conta cc = new ContaCorrente(tais);
        Conta cp = new ContaPoupanca(tais);

        cc.depositar(100);
        cc.transferir(80, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}