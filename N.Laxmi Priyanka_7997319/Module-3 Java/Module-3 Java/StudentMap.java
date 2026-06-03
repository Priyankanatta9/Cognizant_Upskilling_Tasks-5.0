import java.util.*;
public class StudentMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        while (true) { 
            System.out.println("1. Insert student data\n2. Display data\n3. Exit\n");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter student_id and name:");
                int key=sc.nextInt();
                String val=sc.nextLine();
                map.put(key, val);
            }
            else if(choice==2){

                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }
            }
            else if(choice==3){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
