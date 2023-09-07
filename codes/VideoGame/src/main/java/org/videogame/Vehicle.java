package org.videogame;

/**
 * The {@code Vehicle} abstract class serves as a base class for representing various types of
 * vehicles in a video game. It provides information about the vehicle's name and maximum speed.
 */
public abstract class Vehicle {

  /** The name of the vehicle. */
  private final String name;

  /** The maximum speed of the vehicle. */
  private final int maxSpeed;

  /**
   * Gets the name of the vehicle.
   *
   * @return The name of the vehicle as a string.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the maximum speed of the vehicle.
   *
   * @return The maximum speed of the vehicle as an integer.
   */
  public int getMaxSpeed() {
    return maxSpeed;
  }

  /**
   * Abstract method to simulate driving the vehicle. Subclasses must implement this method to
   * specify how the vehicle is driven.
   */
  public abstract void drive();

  /**
   * Constructs a new `Vehicle` object with the specified name and maximum speed.
   *
   * @param name The name of the vehicle.
   * @param maxSpeed The maximum speed of the vehicle.
   */
  public Vehicle(String name, int maxSpeed) {
    this.name = name;
    this.maxSpeed = maxSpeed;
  }
}
