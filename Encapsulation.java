/*Encapsulation-it is defined as the wrapping of data & methods into a single unit.
                it is also implement data hiding.*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
       BankAccount b1=new BankAccount();
       b1.setBalance(5000);
       System.out.println(b1.getBalance());
    }
}
class BankAccount{
    private double balance;

    public void setBalance(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
