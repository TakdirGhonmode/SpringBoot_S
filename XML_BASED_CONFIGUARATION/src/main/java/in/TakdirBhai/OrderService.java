package in.TakdirBhai;

import org.springframework.stereotype.Component;

public class OrderService{
    private PaymentService paymentService;
//    public OrderService(PaymentService paymentService){
//        this.paymentService=paymentService;
//    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public OrderService(){
        System.out.println("the order service obj created succeesfully");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("The data   is placed succesfully");
    }
}
