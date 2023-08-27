package org.videogame;

public class Score {
  private int score;

  public int getScore() {
    return score;
  }

  public void updateScore() {
    score++;
  }

  public void resetScore() {
    score = 0;
  }

  public void printScoreboard() {
    System.out.println("Score: " + score);
  }
}
