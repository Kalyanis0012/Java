package Collection;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(101,"Kalyani");
        map.put(102,"Rahul");
        map.put(103,"Sneha");
        System.out.println(map);
        System.out.println(map.get(102));
            map.remove(103);
        System.out.println(map);
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("sneha"));

    }
}
