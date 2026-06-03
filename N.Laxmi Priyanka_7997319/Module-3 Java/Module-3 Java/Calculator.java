import java.util.*;
public class Calculator {
    static float calculate(int choice,float a,float b){
        switch (choice) {
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;
            default:
                System.out.println("Please enter correct choice");
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        System.out.println("Enter a choice:");
        System.out.print("1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n");
        int choice=sc.nextInt();
        System.out.println(calculate(choice, a, b));
    }
}
