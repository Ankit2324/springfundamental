package fieldDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emplyee {
    @Autowired
    private Address address;
   public String displayAddress(){
        return address.getAddress();
    }
}
