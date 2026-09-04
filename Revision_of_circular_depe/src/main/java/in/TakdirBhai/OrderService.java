package in.TakdirBhai;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
        //call here it is responsible for the manage
        getDetails();
        System.out.println("the order is place sucesfuly");
    }
    public void getDetails(){
        System.out.println("the order informationo");
    }
}
