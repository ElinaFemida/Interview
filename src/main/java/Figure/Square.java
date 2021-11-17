package Figure;

public class Square extends Figure{
    public Square(String name, long area, String color) {
        super(name, area, color);
    }

    @Override
    void calculate() {
        System.out.println("Area of square is " + getArea() + " m2");
    }

}
