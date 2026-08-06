package ComparatorANDComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    int id;
    String name;
    Student(int id,String name){
     this.id=id;
     this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class Comparator{
    static void main() {
        List<Student> list=new ArrayList<>();
        list.add(new Student(3,"Amit"));
        list.add(new Student(1,"Rahul"));
        list.add(new Student(2,"Priya"));
    Collections.sort(list,(s1, s2)->s1.name.compareTo(s2.name));
        System.out.println(list);

    }
}
