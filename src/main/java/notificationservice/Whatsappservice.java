package notificationservice;

import org.springframework.stereotype.Component;

@Component
public class Whatsappservice implements Notificationservice {
    @Override
    public void sendMsg() {
        System.out.println("WhatsApp Message: ");
    }
}
