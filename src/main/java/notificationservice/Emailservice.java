package notificationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Emailservice implements Notificationservice {

    @Override
    public void sendMsg() {
        System.out.println("Email Message: ");
    }
}
