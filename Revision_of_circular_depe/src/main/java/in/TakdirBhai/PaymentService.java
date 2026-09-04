package in.TakdirBhai;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
//    private OrderService orderService;
//    public PaymentService(OrderService orderService){
//        this.orderService=orderService;
//    }
  public void pay(){
//        not his responsibilities
//        orderService.getDetails();
      System.out.println("the payment is done succesfuly");
  }
}
