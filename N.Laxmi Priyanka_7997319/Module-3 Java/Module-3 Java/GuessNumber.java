import java.util.*;
public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(100)+1;
        int n=sc.nextInt();
        while(n<=100){
            if(n==num){
                System.out.println("You guessed the number!");
                break;
            }
            else if(n>num){
                System.out.println("Too high! Try a different number");
                n=sc.nextInt();
            }
            else {
                System.out.println("Too Low! Try a different number");
                n=sc.nextInt();
            }
        }
    }
}
