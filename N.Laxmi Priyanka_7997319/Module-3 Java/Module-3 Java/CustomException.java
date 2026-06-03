import java.util.*;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            throw new InvalidAgeException("Age is less than 18");
        }else System.out.println("OK");

    }
}
