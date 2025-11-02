package je01_sintaxe_semantica;

public class ContaApp {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.imprimirSaldo();
        conta.saldo = 20;
        conta.imprimirSaldo();
    }
}
