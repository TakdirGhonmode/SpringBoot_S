package in.TakdirBhai;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Singleton")
public class OrderService {
    public OrderService(){
        System.out.println("the OrderService obj created successfully");
    }

}
