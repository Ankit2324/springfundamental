package setterDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Appconfig {
    @Bean

    public Address address() {
        return new Address();
    }
    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setAddress(address());
        return employee;
    }
}
