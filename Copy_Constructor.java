import java.util.*;
public class Main {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.name="Mridul";
       s1.rollno=123;

       Student s2=new Student(s1);
       s2.password="xyz";
       System.out.println(s2.name);

    }
}
class Student{
    String name;
    int rollno;
    String password;

    Student(Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
    }
    Student() {
    }

    Student(String n, int r,String p){
        this.name=n;
        this.rollno=r;
        this.password=p;
    }
}
