package chapter11.example.demoprotect2;

import chapter11.example.demoprotect.Monkey;

/**
 * Created by Tino on 2015/12/21.
 */
public class Sloth extends Monkey {
    public static void main(String[] args) {
        System.out.println("m1 status:");
        Sloth s1 = new Sloth();
        s1.breathe();
        s1.eat();
//        s1.tool();
//        s1.climb();
    }
}
