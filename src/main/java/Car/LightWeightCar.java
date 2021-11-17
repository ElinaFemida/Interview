package Car;

import Car.Car;

class LightWeightCar extends Car implements Moveable {

    @Override
    void open() {
        System.out.println("Car.Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car.Car is moving");
    }



}
