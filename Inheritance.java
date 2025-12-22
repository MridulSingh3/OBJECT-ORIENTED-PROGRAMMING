//Inheritance- it is when properties & methods of base class are passed on to a derived class.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animals{
    String color;

    void eat(){
        System.out.println("eats");
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
