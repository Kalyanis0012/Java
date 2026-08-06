package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CollectEx {
    public static void main(String[] args) {
        List<String > names= Arrays.asList("Ram", "Shyam","Mohan");
        List<String> upper=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
    }

}
