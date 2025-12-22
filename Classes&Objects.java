import java.util.*;

public class Main {
    public static void main(String[] args) {
       Pen p1=new Pen();  //Object
       p1.setColor("Blue");
       System.out.println(p1.color);

       p1.setTip(5);
       System.out.println(p1.tip);

       p1.color="Yellow";
       System.out.println(p1.color);

       p1.write();
    }
}
class Pen{ // Class
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
    void write(){
        System.out.println("Writing this pen!");
    }
}
