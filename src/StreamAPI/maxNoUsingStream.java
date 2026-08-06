package StreamAPI;

import java.util.Arrays;
import java.util.List;

 class maxNoUsingStream {
    public static void main(String[] args){

        List<Integer> no= Arrays.asList(10,20,15,25,30);
        int max=no.stream().max(Integer::compareTo).get();
        System.out.println("max no:" +max);
    }
}
