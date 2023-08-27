package org.videogame;

public abstract class Vehicle {
  private final String name;
  private final int maxSpeed;

  public String getName() {
    return name;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public abstract void drive();

  public Vehicle(String name, int maxSpeed) {
    this.name = name;
    this.maxSpeed = maxSpeed;
  }
}
