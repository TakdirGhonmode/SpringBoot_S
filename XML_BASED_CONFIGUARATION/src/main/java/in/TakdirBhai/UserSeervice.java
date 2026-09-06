package in.TakdirBhai;

import java.util.List;

public class UserSeervice {
//    private String user;
//    public UserSeervice(String user){
//        this.user=user;
//    }
//   private List<String> usernames;
//    public UserSeervice(List<String> usernames){
//        this.usernames=usernames;
//    }
//    public List<String> getUser() {
//        return usernames;
//    }
    public UserSeervice(){
        System.out.println("the constructore is called");
    }
    public void init(){
        System.out.println("the init method is called");
    }
    public void cleanup(){
        System.out.println("the obj is destroyed successfully");
    }
}
