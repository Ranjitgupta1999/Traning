abstract class Shape{
    String color;
    abstract double Area();
    public abstract String toString();

    public Shape(String color){
        System.out.println("Constractor called");
        this.color=color;
    }
    public String getcolor(){
        return color;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String color,double radius){
        super(color);
        System.out.println("2nd constractor called");
        this.radius=radius;
    }
    double Area(){
        return Math.PI*Math.pow(radius,2);
    }

    public String toString(){
        return "color of circle is "+super.getcolor()+" and area is "+Area();
    }
}


public class AbstractClass {
    public static void main(String[]arg){
        Circle obj = new Circle("blue",7.6);
        System.out.println(obj.toString());

    }
    
}
