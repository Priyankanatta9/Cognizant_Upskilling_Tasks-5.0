
import java.util.List;
import java.util.stream.Collectors;

public class Record {
    public record Person(String name,int age){}
    public static void main(String[] args) {
        List<Person> people=List.of(
            new Person("John", 18),
            new Person("Carol", 22),
            new Person("Maria", 24),
            new Person("Anna", 20)
        );
        List<Person> result=people.stream().filter(p->p.age()>21).collect(Collectors.toList());
        System.out.println("All People:"+people);
        System.out.println("People with age greater than 21:"+result);
    }
}
