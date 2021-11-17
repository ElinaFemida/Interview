package Figure;


public class Triangle extends Figure {
    public Triangle(String name, long area, String color) {
        super(name, area, color);
    }

    @Override
    void calculate() {
        System.out.println("Area of triangle is " + getArea() + " m2");
    }


}