package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
     public static void main(String[] args) {
        TreeMap  tm=new TreeMap();
        tm.put("103","Java");
        tm.put("104","c++");
        Object o=tm.put("101",".Net");
        System.out.println(o);
        Object o1=tm.put("101","c");
        System.out.println(o1);
        Set s=tm.keySet();
        Iterator itr= s.iterator();
        while(itr.hasNext()){
            String key=(String) itr.next();
            System.out.println("kay :" +key);
            System.out.println("value : "+tm.get(key));
        }

    }
}
