package je12_pilares_POO.MessengeSenders;

public class FacebookMessenger extends Messenger{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook!;");
        this.metodoProtegido();
    }
}
