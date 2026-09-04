package in.TakdirBhai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
         OrderService obj1=context.getBean(OrderService.class);
         obj1.placeOrder();
    }
}
