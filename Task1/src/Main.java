// Shape.java
abstract class Shape {
    // Abstract method untuk menghitung luas
    public abstract double calculateArea();

    // Method umum yang bisa dipanggil semua turunan
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // πr²
    }
}

// Square.java
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side; // sisi²
    }
}

// Triangle.java
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // ½ × alas × tinggi
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek masing-masing bentuk
        Shape circle = new Circle(7);       // jari-jari 7
        Shape square = new Square(5);       // sisi 5
        Shape triangle = new Triangle(6, 4); // alas 6, tinggi 4

        // Menampilkan luas masing-masing bentuk
        System.out.println("=== Area of Shapes ===");
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
