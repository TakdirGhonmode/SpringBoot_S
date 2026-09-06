package in.TakdirBhai;

import in.TakdirBhai.Payment.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//         OrderService obj1=context.getBean("orderService",OrderService.class);
//         obj1.placeOrder();
//         PaymentService pa=context.getBean("paymentService", PaymentService.class);
        UserSeervice u=context.getBean(UserSeervice.class);
        context.close();
//        System.out.println(u.getUser());
    }
}
