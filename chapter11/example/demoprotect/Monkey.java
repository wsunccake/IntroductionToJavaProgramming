package chapter11.example.demoprotect;

/**
 * Created by Tino on 2015/12/21.
 */
public class Monkey {
    public static void main(String[] args) {
        System.out.println("m1 status:");
        Monkey m1 = new Monkey();
        m1.breathe();
        m1.eat();
        m1.tool();
        m1.climb();
    }

    public void breathe() {
        System.out.println("Monkey breathe");
    }

    protected void eat() {System.out.println("Monkey eat");
    }
    void tool() {System.out.println("Monkey tool");
    }
    private void climb() {
        System.out.println("Monkey treeclimb");}
}