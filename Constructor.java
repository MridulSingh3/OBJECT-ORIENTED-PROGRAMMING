import java.util.*;
public class Main {
    public static void main(String[] args) {
       Student s1=new Student("Mridul",1394);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
    }
}
class Student{
    String name;
    int rollno;

    Student(String n, int r){
        this.name=n;
        this.rollno=r;

        System.out.println("contructor is called...");
    }
}
