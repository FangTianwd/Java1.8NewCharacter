package NewCharacter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamTest {
    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList("aaa","sss","ddd","cc","213","asdsa","dfd","swq");
        List<String> list = stringCollection
        .stream()
        .filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(list);
        
        List<String> list2 = stringCollection.stream().sorted((a, b) -> a.length()-b.length()).collect(Collectors.toList());
        System.out.println(list2);
        List<String> list3 = stringCollection.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list3);
    }
}
