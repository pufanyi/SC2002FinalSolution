package org.videogame;

import java.util.Scanner;

public class Game {
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
