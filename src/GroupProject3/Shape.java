package GroupProjects.GroupProject3;

import java.util.Scanner;

/*
Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimeter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
        */
public interface Shape {
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape{
    double radius;
    public void calculateArea(){
        double area= Math.PI*radius*radius;
        System.out.println("Area of a circle is "+String.format("%.2f",area));
    }
    public void calculatePerimeter(){
        double perimeter=(2*Math.PI*radius);
        System.out.println("Perimeter of a circle is "+String.format("%.2f",+perimeter));
    }

}
class Square implements Shape{
    double side;
    public void calculateArea(){
        System.out.println("Area of a square is "+String.format("%.2f",(side*side)));
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter of a square is "+String.format("%.2f",(side*4)));

    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the radius of your circle");
        Scanner scan= new Scanner(System.in);

        Circle obj= new Circle();
        obj.radius=scan.nextDouble();
        obj.calculateArea();
        obj.calculatePerimeter();

        System.out.println("Please enter the length of one of the sides of the square");
        Square task= new Square();
        task.side=scan.nextDouble();
        task.calculateArea();
        task.calculatePerimeter();
/*
static Shape Circle;
     static Shape Square;
Shape [] array= {new Circle(),new Square()};
        for(Shape arr:array) {
            arr.calculateArea();
            arr.calculatePerimeter();- a way to put it through an array
 */
    }
}
