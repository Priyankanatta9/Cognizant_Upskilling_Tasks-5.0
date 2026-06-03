import java.util.*;
public class LambdaSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>(Arrays.asList("John","Iruma","Rose","Jack","Clara","Teju"));
        System.out.println("List before sorting:");
        for(String s : list) System.out.print(s+" ");
        System.out.println();
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println("List after sorting:");
        for(String s : list) System.out.print(s+" ");
    }
    
}
