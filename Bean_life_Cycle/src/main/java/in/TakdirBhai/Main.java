package in.TakdirBhai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//        Config config=context.getBean(Config.class);
//        config.show();
        CartService cartService=context.getBean(CartService.class);
        System.out.println("the value of the given key is=>"+cartService.getValue(2));
        context.close();
    }
}
