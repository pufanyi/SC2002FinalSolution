package org.videogame;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the type of vehicle (car or boat): ");
    String vehicleType = scanner.next();
    while (!vehicleType.equalsIgnoreCase("car") && !vehicleType.equalsIgnoreCase("boat")) {
      System.out.print("Invalid vehicle type. Enter the type of vehicle (car or boat): ");
      vehicleType = scanner.next();
    }
    Game.start(vehicleType);
  }
}
