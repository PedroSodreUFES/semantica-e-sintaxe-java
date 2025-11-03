package je08_javaBeans;
// getters e setters
public class Beans {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade < 0)
            throw new IllegalArgumentException("Idade não pode ser menor que zero!");
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Beans(String novoNome, int novaIdade){
        this.nome = novoNome;
        this.idade = novaIdade;
    }
}
