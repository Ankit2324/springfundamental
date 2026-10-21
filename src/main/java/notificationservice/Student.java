package notificationservice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private Notificationservice notificationservice;
    @Autowired
    public Student(Notificationservice notificationservice) {
        this.notificationservice = notificationservice;
    }
public void notifyStudent() {
        notificationservice.sendMsg();
    }
    @PostConstruct
    public void init() {
        System.out.println("Student bean is initialized");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Student bean is being destroyed");
    }
}
