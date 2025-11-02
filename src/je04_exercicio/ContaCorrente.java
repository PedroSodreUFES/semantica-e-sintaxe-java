package je04_exercicio;

import je01_sintaxe_semantica.Conta;

import java.time.LocalDate;
public class ContaCorrente {
    Integer conta = 1;
    Integer agencia = 1;
    String nomeCliente = "Pedro";
    LocalDate dataNascimento;
    Double saldo = 100.0;
    boolean ativo = true;

    void sacar(double valor) {}
    void transferir (ContaCorrente contaDestino, Double valor) {}
    void cancelar(String justificativa) {}
    void extrato(LocalDate inicio, LocalDate fim) {}
    Double getSaldo() {
        return saldo;
    }
}
