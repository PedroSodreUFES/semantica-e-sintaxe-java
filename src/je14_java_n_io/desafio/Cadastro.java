package je14_java_n_io.desafio;

import java.time.LocalDate;

public class Cadastro {
    String  nome;
    String  sexo;
    Long    telefone;
    LocalDate dataNascimento;
    Double valorSugerido;
    boolean cliente;

    // este construtor é somente para ilustrar este exemplo
    // evite propagar esta estratégia ao longo dos seus estudos e projetos
    public Cadastro(String nome, String sexo, Long telefone, LocalDate dataNascimento, Double valorSugerido, boolean cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.valorSugerido = valorSugerido;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public Double getValorSugerido() {
        return valorSugerido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Long getTelefone() {
        return telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean isCliente() {
        return cliente;
    }

    @Override
    public String toString(){
        return this.nome;
    }

    // métodos getters para obter os dados dos objetos
}