package setterDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Employee employee = context.getBean(Employee.class);
        employee.getEmpAddress();
        context.close();
    }
}
