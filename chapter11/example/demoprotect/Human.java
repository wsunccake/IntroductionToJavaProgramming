package chapter11.example.demoprotect;

/**
 * Created by Tino on 2015/12/21.
 */
public class Human extends Monkey{
    public static void main(String[] args) {
        System.out.println("h1 status:");
        Human h1 = new Human();
        h1.breathe();
        h1.eat();
        h1.tool();
//        h1.climb();
    }
}
