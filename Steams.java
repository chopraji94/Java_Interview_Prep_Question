import java.util.*;

public class Steams {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(6,5,2,8,1,7);

        // nums.stream().filter(e -> e%2==0).map(e -> e*2).forEach(n -> System.out.println(n));

        // List<Integer> evenList = nums.stream().filter(e -> e%2==0).toList();

        // System.out.println(evenList.toString());

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Date");

        List<String> newList = list.stream().filter(e -> e.startsWith("A")).map(e -> e.toLowerCase()).toList();

        System.out.println(newList.toString());

    }
}
