package charpter11.example;

/**
 * Created by chen on 2015/12/8.
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
    class GraduateStudent extends Student{
    }
    class Student extends Person{
        @Override
        public String toString(){
            return "Student";
        }
    }
    class Person extends Object{
        @Override
        public String toString(){
            return "Person";
        }
    }
}
