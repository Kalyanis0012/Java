package StreamAPI;

import java.util.Arrays;
import java.util.List;

 class MapEx {
    public static void main(String[] args) {
        List<String> n= Arrays.asList("ram","shyam","mohan");
        n.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
