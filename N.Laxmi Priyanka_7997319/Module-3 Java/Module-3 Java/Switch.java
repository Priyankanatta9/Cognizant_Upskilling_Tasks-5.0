public class Switch {
    static void datatype(Object o){
        String output=switch(o){
            case Integer i->"Integer: "+i;
            case String s->"String: "+s;
            case Double d->"Double: "+d;
            case null->"Null";
            default->"Unknown object : "+o.getClass().getSimpleName();
        };
        System.out.println(output);
    }
    public static void main(String[] args) {
        datatype("Carol");
        datatype(23);
        datatype(8.75);
        datatype(null);
        datatype(3.14f);
    }
}
