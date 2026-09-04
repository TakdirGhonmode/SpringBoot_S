package in.TakdirBhai;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements DisposableBean/* implements InitializingBean */{
    Map<Integer,String> data;
    public CartService(){
       data=new HashMap<>();
       System.out.println("the default constructor is called");
    }

//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("the bean is ready");
//        data.put(1,"takdir");
//        data.put(2,"Anmol");
//    }
//    public void start(){
//        System.out.println("the bean is ready");
//       data.put(1,"takdir");
//       data.put(2,"Anmol");
//    }
    @PostConstruct
     public void start2(){
        System.out.println("the bean is ready");
        data.put(1,"takdir");
        data.put(2,"Anmol");
    }
    public void addToCart(){
        System.out.println("the item added in the cart sucessfully");
    }
    public String getValue(int key){
        return data.get(key);
    }

    @Override
    public void destroy() throws Exception {
        data.clear();
        System.out.println("the bean is distroyed");
    }
}
