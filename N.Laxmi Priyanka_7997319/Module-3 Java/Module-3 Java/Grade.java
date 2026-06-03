import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks<0||marks>100) System.out.println("Invalid Marks");
        else if(marks>=90&&marks<=100) System.out.println("A Grade");
        else if(marks>=80&&marks<=89) System.out.println("B Grade");
        else if(marks>=70&&marks<=79) System.out.println("C Grade");
        else if(marks>=60&&marks<=69) System.out.println("D Grade");
        else System.out.println("F Grade");
    }
}
