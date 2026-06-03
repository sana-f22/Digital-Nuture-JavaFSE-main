import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Arun");
        map.put(2, "Priya");

        System.out.println(map.get(1));
    }
}