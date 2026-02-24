
import java.util.*;
public class chr {
    public static void main(String[] args) {
        int n=4;
         char ch='A';
        //  outer loop
        for (int line=1;line<=n;line++){
            // inner loop
            for(int chara=1;chara<=line;chara++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }}
    }