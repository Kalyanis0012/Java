class Employee{
    String name;
    double salary;
     void login(){
         System.out.println(name + "logged in");
     }
     void work(){
         System.out.println("employee is working");
     }

}
class Developer extends Employee{
    void writeCode(){
        System.out.println(name+ " is writing java code");
    }
}
class Tester extends Employee{
    void testSoftware(){
        System.out.println(name + " is testing software");
    }
}

public class InheritanceRealWorldEx {
    public static void main(String[] args){
        Developer d=new Developer();
        d.name="Kalyani";
        d.salary=50000;

        d.login();
        d.work();
        d.writeCode();

        Tester t=new Tester();
        t.name="Siddhant";
        t.salary=55000;

        t.login();
        t.work();
        t.testSoftware();
    }

}
