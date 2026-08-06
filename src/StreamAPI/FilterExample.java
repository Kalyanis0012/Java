package StreamAPI;

import java.util.*;

class FilterExample {
   public static void main(String[] args) {
        List<Integer> no= Arrays.asList(10,20,15,25,30);
        no.stream().filter(n->n%2==0).forEach(System.out::println);
    }

}
