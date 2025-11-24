import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        sj.add("Suraj");
        sj.add("Rahul");
        sj.add("Amit");

        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(" | ");
        sj2.add("Apple");
        sj2.add("Banana");

        sj.merge(sj2);

       System.out.println(sj);
    }
    
}
