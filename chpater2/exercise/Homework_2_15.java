package chpater2.exercise;
import java.util.Scanner;

public class Homework_2_15 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println("The distance between the two points is :" + distance);
    }
}
