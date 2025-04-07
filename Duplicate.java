import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List after removing duplicates: " + uniqueStrings);
    }
}
