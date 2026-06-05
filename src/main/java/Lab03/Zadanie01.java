package Lab03;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    private String name;
    private String surname;
    private int age;
    public Student(String name,String surname,int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
public class Zadanie01 {
    public static void main(String[] args) {

        //Zakomentowałem te linijki bo to nie jest związane stricte z predykatem tylko innym interfejsem
//        Function<Integer,String> function=t->t+t+" zajęcia.pl";
//        System.out.println(function.apply(69));

        Predicate<Student> predicate=p->p.getAge()>21;
        boolean test1=predicate.test(new Student("Jan","Kowalski",21)); //zwraac false
        boolean test2=predicate.test(new Student("Karol","Nowak",23)); //zwroci true, zgodne z predykatem

        System.out.println(test1);
        System.out.println(test2);
    }
}
