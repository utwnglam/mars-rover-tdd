package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
  private final List<Character> directionMap = Arrays.asList('N', 'E', 'S', 'W');
  private final Coordination pos;

  public MarsRover(Coordination coordination) {
    this.pos = coordination;
  }

  public void executeAction(char command) {
    switch (command) {
      case 'M': {
        moveForward();
        break;
      }
      case 'L': {
        turnLeft();
        break;
      }
      case 'R': {}
    }
  }

  private void turnLeft() {
    int newDIndex = directionMap.indexOf(pos.getD())-1;
    if (newDIndex < 0) {
      newDIndex = newDIndex + 4;
    }
    pos.setD(directionMap.get(newDIndex));
  }

  private void moveForward() {
    switch (pos.getD()) {
      case 'N': {
        pos.setY(pos.getY()+1);
        break;
      }
      case 'E': {
        pos.setX(pos.getX()+1);
        break;
      }
      case 'S': {
        pos.setY(pos.getY()-1);
        break;
      }
      case 'W': {
        pos.setX(pos.getX()-1);
        break;
      }
    }
  }

  public String getStatus() {
    return pos.toString();
  }
}
