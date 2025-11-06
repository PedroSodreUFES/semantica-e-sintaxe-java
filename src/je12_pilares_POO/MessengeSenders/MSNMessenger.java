package je12_pilares_POO.MessengeSenders;

public class MSNMessenger extends Messenger{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN!");
        this.metodoProtegido();
    }
}
