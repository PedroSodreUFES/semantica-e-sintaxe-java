package je10_POO.enums;

public enum EstadoBrasileiro {
    PIAUI ("Piauí", "PI"),
    MARANHAO ("Maranhão", "MA"),
    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ");

    private String sigla;
    private String nome;

    private EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
