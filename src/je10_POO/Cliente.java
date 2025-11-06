package je10_POO;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;

    public Cliente(String nome, Double limite){
        this.nome = nome;
        this.limiteCredito = limite;
    }

    public void solicitarLimiteCredito(Double valorSolicitado) {
        limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteCredito-= valorProduto;
    }
}
