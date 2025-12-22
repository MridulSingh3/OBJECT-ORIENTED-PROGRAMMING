import java.util.*;
public class Main {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
        d.walk();
        System.out.println(d.color);
    }
}

abstract class Animal{
    String color;

    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eat");
    }
    abstract void walk();
}
class Deer extends Animal{
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs!");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color="white";
    }
    void walk(){
        System.out.println("walk on 2 legs!");
    }
}