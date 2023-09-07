package org.videogame;

/**
 * The {@code Boat} class represents a type of vehicle specifically for boats. It extends the {@code
 * Vehicle} class and provides information about the boat's name, maximum speed, and propulsion
 * method.
 */
public class Boat extends Vehicle {

  /** The propulsion method used by the boat. */
  private final String propulsion;

  /**
   * Constructs a new {@code Boat} object with the specified name, maximum speed, and propulsion
   * method.
   *
   * @param name The name of the boat.
   * @param maxSpeed The maximum speed of the boat.
   * @param propulsion The propulsion method used by the boat.
   */
  public Boat(final String name, final int maxSpeed, final String propulsion) {
    super(name, maxSpeed);
    this.propulsion = propulsion;
  }

  /**
   * Gets the propulsion method used by the boat.
   *
   * @return The propulsion method as a string.
   */
  public String getPropulsion() {
    return propulsion;
  }

  /**
   * Overrides the {@code drive} method from the parent class {@code Vehicle} to specify how the
   * boat is driven, including the propulsion method and maximum speed.
   */
  @Override
  public void drive() {
    System.out.println("Driving the boat with " + propulsion + " at max speed: " + getMaxSpeed());
  }
}
