package Assignment2.question2;

public class question2{
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5);
        System.out.println(triangle1.getPerimeter());
        Triangle triangle2 = new Triangle(10,5);
        System.out.println(triangle2.getArea());

        rhombus rhombus1 = new rhombus(10);
        System.out.println(rhombus1.getPerimeter());
        rhombus rhombus2 = new rhombus(10,5);
        System.out.println(rhombus2.getArea());

        Shape shape1 = new Shape("square",10,100.0,40);
        shape1.printShape();
    }
}

class Shape {
    String name;
    int color;
    double area;
    double perimeter;

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    //Constructors
    public Shape() {
    }

    public Shape(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, int color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    //Methods
    public void printShape() {
        System.out.println("name: " + name + " color: " +
                color + " area: " + area + " perimeter: " +
                perimeter);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

class Triangle extends Shape {
    double base, height, side;

    //Getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Constructors
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double side) {//Equilateral triangle
        this.side = side;
    }

    //Methods
    @Override
    public double getArea() {
        area = (base * height) / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * 3;
        return perimeter;

    }
}

class rhombus extends Shape {
    double diagonal_d1, diagonal_d2;

    public rhombus(double diagonal_d1, double diagonal_d2) {
        this.diagonal_d1 = diagonal_d1;
        this.diagonal_d2 = diagonal_d2;
    }

    public double getDiagonal_d1() {
        return diagonal_d1;
    }

    public void setDiagonal_d1(double diagonal_d1) {
        this.diagonal_d1 = diagonal_d1;
    }

    public double getDiagonal_d2() {
        return diagonal_d2;
    }

    public void setDiagonal_d2(double diagonal_d2) {
        this.diagonal_d2 = diagonal_d2;
    }

    //square
    public rhombus(double diagonal_d1) {
        this.diagonal_d1 = diagonal_d1;
    }

    //Methods
    @Override
    public double getArea() {
        area = (diagonal_d1 * diagonal_d2) / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = Math.sqrt(2) * 2 * diagonal_d1;
        return perimeter;

    }
}
