package org.videogame;

import java.util.Scanner;

/**
 * The {@code Main} class serves as the entry point for the video game application. It allows the
 * player to choose between creating and driving a car or a boat.
 */
public class Main {

  /**
   * The main method of the application that interacts with the player to select the type of vehicle
   * (car or boat) to create and drive.
   *
   * @param args The command-line arguments (not used in this application).
   */
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
