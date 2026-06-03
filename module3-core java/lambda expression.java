import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Apple", "Mango");

        Collections.sort(list, (a,b) -> a.compareTo(b));

        System.out.println(list);
    }
}