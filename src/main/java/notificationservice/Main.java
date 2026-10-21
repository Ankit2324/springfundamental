package notificationservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(Appconfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student.hashCode());
        student.notifyStudent();
        context.close();
    }
}
