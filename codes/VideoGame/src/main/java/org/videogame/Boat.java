package org.videogame;

public class Boat extends Vehicle {
  private final String propulsion;

  public String getPropulsion() {
    return propulsion;
  }

  public Boat(String name, int maxSpeed, String propulsion) {
    super(name, maxSpeed);
    this.propulsion = propulsion;
  }

  @Override
  public void drive() {
    System.out.println("Driving the boat with " + propulsion + " at max speed: " + getMaxSpeed());
  }
}
