package Assignment2.question3;

public class question3 {
    public static void main(String args[]) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}

class Shape {
    String name;
    double area, perimeter;

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Shape() {
    }

    public void display() {
        System.out.println("name: " + getClass().getName()
                + '\t' + "area: " + getArea()
                + '\t' + "perimeter: " + getPerimeter());
    }

}

class Rectangle extends Shape {
    double length, width;


    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        area = length * width;
        System.out.println("Area: " + length * width);
    }

    public void computePerimeter() {
        perimeter = (length + width) * 2;
        System.out.println("Perimeter:" + (length + width) * 2);
    }


}

class Circle extends Shape {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        area = radius * radius * Math.PI;
        System.out.println("Area: " + radius * radius * Math.PI);
    }

    public void computePerimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter:" + 2 * Math.PI * radius);
    }


}