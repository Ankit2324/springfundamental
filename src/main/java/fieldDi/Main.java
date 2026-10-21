package fieldDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Addconfig.class);
        Emplyee employee = context.getBean(Emplyee.class);
        String result = employee.displayAddress();
        System.out.println(result);
        context.close();
    }
}
