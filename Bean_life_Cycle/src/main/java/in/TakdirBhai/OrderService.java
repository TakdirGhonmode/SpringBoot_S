package in.TakdirBhai;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        System.out.println("the process is started......................");
        paymentService.pay();
        System.out.println("the order is placed succesfully");
    }
}
