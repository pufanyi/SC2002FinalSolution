package org.videogame;

/**
 * The {@code Car} class represents a type of vehicle specifically for cars. It extends the {@code
 * Vehicle} class and provides information about the car's name, maximum speed, number of wheels,
 * and number of doors.
 */
public class Car extends Vehicle {

  /** The number of wheels on the car. */
  private final int numWheels;

  /** The number of doors on the car. */
  private final int numDoors;

  /**
   * Constructs a new {@code Car} object with the specified name, maximum speed, number of wheels,
   * and number of doors.
   *
   * @param name The name of the car.
   * @param maxSpeed The maximum speed of the car.
   * @param numWheels The number of wheels on the car.
   * @param numDoors The number of doors on the car.
   */
  public Car(String name, int maxSpeed, int numWheels, int numDoors) {
    super(name, maxSpeed);
    this.numWheels = numWheels;
    this.numDoors = numDoors;
  }

  /**
   * Gets the number of wheels on the car.
   *
   * @return The number of wheels as an integer.
   */
  public int getNumWheels() {
    return numWheels;
  }

  /**
   * Gets the number of doors on the car.
   *
   * @return The number of doors as an integer.
   */
  public int getNumDoors() {
    return numDoors;
  }

  /**
   * Overrides the {@code drive} method from the parent class {@code Vehicle} to specify how the car
   * is driven, including the maximum speed.
   */
  @Override
  public void drive() {
    System.out.println("Driving the car at max speed: " + getMaxSpeed());
  }
}
