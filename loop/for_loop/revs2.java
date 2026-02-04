import java.util.*;
public class revs2 {
    public static void main(String args[]) {
     int n =99045;
     int rev=0;
        while(n>0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}