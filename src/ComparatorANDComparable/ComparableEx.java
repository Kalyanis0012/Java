package ComparatorANDComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
    int id;
    String name;

    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Student1 s){
        return this.id-s.id;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class ComparableEx {
    public static void main(String[] args) {
        List<Student1> list=new ArrayList<>();
        list.add(new Student1(3,"Amit"));
        list.add(new Student1(1,"Rahul"));
        list.add(new Student1(2,"Priya"));
        Collections.sort(list);
        System.out.println(list);

    }
}
