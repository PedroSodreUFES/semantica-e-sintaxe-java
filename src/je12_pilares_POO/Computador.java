package je12_pilares_POO;

import je12_pilares_POO.MessengeSenders.FacebookMessenger;
import je12_pilares_POO.MessengeSenders.MSNMessenger;
import je12_pilares_POO.MessengeSenders.Messenger;
import je12_pilares_POO.MessengeSenders.TelegramMessenger;

public class Computador {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println();

        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();
        System.out.println();

        TelegramMessenger telegramMessenger = new TelegramMessenger();
        telegramMessenger.enviarMensagem();
        telegramMessenger.receberMensagem();

        // polimorfismo;
        System.out.println("\nPolimorfismo:");
        Messenger messenger = new FacebookMessenger();
        messenger.enviarMensagem();
        messenger = new TelegramMessenger();
        messenger.enviarMensagem();
        messenger = new MSNMessenger();
        messenger.enviarMensagem();
    }
}
