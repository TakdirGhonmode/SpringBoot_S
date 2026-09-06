package in.TakdirBhai;

import in.TakdirBhai.Payment.PaymentService;

public class OrderService{
    private PaymentService paymentService;
    //inject the dependency via constructor
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    //inject the dependency using the setter
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    public OrderService(){
//        System.out.println("the order service obj created succeesfully");
//    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("The data   is placed succesfully");
    }
}
