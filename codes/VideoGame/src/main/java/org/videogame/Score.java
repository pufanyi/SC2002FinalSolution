package org.videogame;

/**
 * The {@code Score} class represents a simple scoring mechanism for a video game. It keeps track of
 * a player's score and provides methods to update, reset, and print the score.
 */
public class Score {

  /** The current score. */
  private int score;

  /**
   * Gets the current score.
   *
   * @return The current score as an integer.
   */
  public int getScore() {
    return score;
  }

  /** Updates the score by incrementing it by 1. */
  public void updateScore() {
    score++;
  }

  /** Resets the score to zero. */
  public void resetScore() {
    score = 0;
  }

  /** Prints the current score to the console. */
  public void printScoreboard() {
    System.out.println("Score: " + score);
  }
}
