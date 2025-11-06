package je12_pilares_POO.MessengeSenders;

public abstract class Messenger {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // método impossível de ser chamado por uma instância ou por uma classe filha.
    private void metodoPrivado() {
        System.out.println("Impossível me chamar!");
    }

    // método impossível de ser chamado por uma instância, mas pode por uma classe filha
    protected void metodoProtegido(){
        System.out.println("Chamando método protegido na classe pai!");
    }
}
