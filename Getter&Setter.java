import java.util.*;

public class Main {
    public static void main(String[] args) {
       Pen p1=new Pen(); //Object
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Pen{
    private String color;
    private int tip;
    
    //Getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    //Setter
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
