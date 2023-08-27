package org.videogame;

public class Car extends Vehicle {
  private final int numWheels;
  private final int numDoors;

  public int getNumWheels() {
    return numWheels;
  }

  public int getNumDoors() {
    return numDoors;
  }

  @Override
  public void drive() {
    System.out.println("Driving the car at max speed: " + getMaxSpeed());
  }

  public Car(String name, int maxSpeed, int numWheels, int numDoors) {
    super(name, maxSpeed);
    this.numWheels = numWheels;
    this.numDoors = numDoors;
  }
}
