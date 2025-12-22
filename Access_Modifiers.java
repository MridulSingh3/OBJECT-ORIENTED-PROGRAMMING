import java.util.*;

public class Main {
    public static void main(String[] args) {
       BankAccount b1=new BankAccount(); //Object
       b1.username="Mridul Singh";
       System.out.println(b1.username);

       b1.setPassword("12344");
       System.out.println(b1.password);  //Give Error
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String changePassword){
        password=changePassword;
    }
}
