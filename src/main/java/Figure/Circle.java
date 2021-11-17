package Figure;

public class Circle extends Figure {
    public Circle(String name, long area, String color) {
        super(name, area, color);
    }
    @Override
    void calculate() {
        System.out.println("Area of circle is " + getArea() + " m2");
    }

}