import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==0 || n==1) System.out.println(1);
        else{
            for(int i=n;i>0;i--){
                fact*=i;
            }
        }
        System.out.println(fact);
    }
}
