package charpter11.example;

/**
 * Created by chen on 2015/12/8.
 */
public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new CircleFromSimpleGeometricObject(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1,1);
        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        System.out.println("The circle area is "+((CircleFromSimpleGeometricObject)object).getArea());
        System.out.println("The circle diameter is "+((CircleFromSimpleGeometricObject)object).getDiameter());
    }
    else if (object instanceof RectangleFromSimpleGeometricObject){
        System.out.println("The rectangle area is "+((RectangleFromSimpleGeometricObject)object).getArea());
    }
}