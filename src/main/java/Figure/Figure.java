package Figure;

import lombok.Getter;

@Getter
abstract public class Figure implements Paint {
    private String name;
    private long area;
    private String color;

    public Figure(String name, long area, String color) {
        this.name = name;
        this.area = area;
        this.color = color;
    }

    abstract void calculate();

    @Override
    public void paint() {
        System.out.println("Figure " + name + " is painted in " + color);
    }
}
