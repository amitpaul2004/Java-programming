import java.util.*;
public class else_if{
    public static void main (String args []){
        int age=13;
        if (age>18){
            System.out.println("ADULT");
        }
        else if (age>13 && age<18){
            System.out.println("you are a teenager");
        }
        else{
            System.out.println("CHILD");
        }
       
    }
}