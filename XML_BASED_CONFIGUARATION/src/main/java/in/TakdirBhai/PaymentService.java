package in.TakdirBhai;

public class PaymentService {
    private String type;
    private int retryCount;
    public PaymentService(String type,int retryCount){
        this.type=type;
        this.retryCount=retryCount;
    }
    public PaymentService(){
        System.out.println("the Constructor of the PaymentService");
    }
    public void pay(){
        System.out.println("the payment is done🤞🤞 the payment method is=>"+type+"with the retry count="+retryCount);
    }
}
