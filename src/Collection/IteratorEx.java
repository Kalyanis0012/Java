package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(84);
        al.add(74);
        al.add(59);
        al.add(80);
        al.add(84);
        System.out.println(al);
        Iterator<Integer> itr= al.iterator();
        while(itr.hasNext()){
            int x=itr.next();
            System.out.println(x+5);
        }
    }
}
