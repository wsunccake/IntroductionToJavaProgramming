package chapter9.exercise;

class Test {
    public static void main(String[] args) {
        A a = new A("aaa");
    }
}

class A {
    String s;

    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}