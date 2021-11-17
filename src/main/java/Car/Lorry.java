package Car;

import Car.Car;

// BEFORE: class Car.Lorry extends Car.Car, Moveable, Stopable{
// AFTER
class Lorry extends Car implements Moveable, Stopable {

    public void move() {
        System.out.println("Car.Car is moving");
    }

    public void stop() {
        System.out.println("Car.Car is stop");
    }

    // abstract method 'open()' in 'Car.Car' implemented
    @Override
    void open() {

    }

}
