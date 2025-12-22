import java.util.*;
public class Main {
    public static void main(String[] args) {
        peacock p = new peacock();
        p.eat();
    }
}

class Animals {
    String color;

    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Fish extends Animals{
    void swin(){
        System.out.println("swin");
    }
}
class Tuna extends Fish{
    void fastSwimming(){
        System.out.println("Fast Swim");
    }
}
class shark extends Fish{
    void coldBlood(){
        System.out.println("cold blood");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("fly");
    }
}
class peacock extends Bird{
    void beautifulFeather(){
        System.out.println("Beautiful Feather");
    }
}
