package je12_pilares_POO.MessengeSenders;

public class TelegramMessenger extends Messenger{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram!;");
        this.metodoProtegido();
    }
}
