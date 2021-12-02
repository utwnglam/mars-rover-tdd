package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
  private final List<Character> directionMap = Arrays.asList('N', 'E', 'S', 'W');
  private final Position pos;

  public MarsRover(Position coordination) {
    this.pos = coordination;
  }

  public void executeActions(String command) {
    for (char ch: command.toCharArray()) {
      executeAction(ch);
    }
  }

  private void executeAction(char oneCommand) {
    switch (oneCommand) {
      case 'M': {
        moveForward();
        break;
      }
      case 'L': {
        turnLeft();
        break;
      }
      case 'R': {
        turnRight();
        break;
      }
    }
  }

  private void turnRight() {
    int newDIndex = directionMap.indexOf(pos.getD())+1;
    if (newDIndex > 3) {
      newDIndex = newDIndex - 4;
    }
    pos.setD(directionMap.get(newDIndex));
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
