import java.util.Scanner;

public class Palindrome {
    static String rev(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String reverse=rev(s.toLowerCase());
        System.out.println(s.equals(reverse));
    }
}
