package org.videogame;

import java.util.Scanner;

/**
 * The {@code Game} class provides a simple interactive game where the player can create and drive
 * different types of vehicles such as cars and boats.
 */
public class Game {
  /**
   * Starts the game by allowing the player to create and drive a vehicle of the specified type (car
   * or boat) based on user input.
   *
   * @param vehicleType The type of vehicle to create and drive (car or boat).
   * @throws IllegalArgumentException if an invalid vehicle type is provided.
   */
  public static void start(String vehicleType) {
    Vehicle vehicle;
    Scanner scanner = new Scanner(System.in);
    if (vehicleType.equalsIgnoreCase("car")) {
      System.out.print("Enter the name of the car: ");
      String name = scanner.next();
      System.out.print("Enter the max speed of the car: ");
      int maxSpeed = scanner.nextInt();
      System.out.print("Enter the number of wheels of the car: ");
      int numWheels = scanner.nextInt();
      System.out.print("Enter the number of doors of the car: ");
      int numDoors = scanner.nextInt();
      vehicle = new Car(name, maxSpeed, numWheels, numDoors);
    } else if (vehicleType.equalsIgnoreCase("boat")) {
      System.out.print("Enter the name of the boat: ");
      String name = scanner.next();
      System.out.print("Enter the max speed of the boat: ");
      int maxSpeed = scanner.nextInt();
      System.out.print("Enter the propulsion of the boat: ");
      String propulsion = scanner.next();
      vehicle = new Boat(name, maxSpeed, propulsion);
    } else {
      throw new IllegalArgumentException("Invalid vehicle type");
    }
    vehicle.drive();
  }
}
