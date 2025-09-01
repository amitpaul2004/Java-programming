// odd even search
import java.util.*;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.println("Input 5 elements ");
        for(int i=0;i<5;i++){
           int n=sc.nextInt();
              v.addElement(n);
        }
        int e=0,o=0;
        for (int i:v){
            if(i%2==0){
                e++;
            }
            else{
                o++;
            }
            System.out.println("Even numbers are "+e+" and Odd numbers are "+o);

        }
    }
}