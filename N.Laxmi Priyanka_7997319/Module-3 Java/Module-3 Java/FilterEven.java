import java.util.*;
import java.util.stream.Collectors;
public class FilterEven {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> result=list.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("Even numbers are:");
        for(int num : result) System.out.print(num+" ");
    }
}
