package com.afs.tdd;

public class Position {
  private int x;
  private int y;
  private char D;

  public Position(int x, int y, char D) {
    this.x = x;
    this.y = y;
    this.D = D;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public char getD() {
    return D;
  }

  public void setD(char d) {
    D = d;
  }

  @Override
  public String toString() {
    return String.format("%d %d %c", x, y, D);
  }
}
