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
      default:
//        break;
    }
  }

  private void turnRight() {
    int newDirIndex = directionMap.indexOf(pos.getDir())+1;
    if (newDirIndex > 3) {
      newDirIndex = newDirIndex - directionMap.size();
    }
    pos.setDir(directionMap.get(newDirIndex));
  }

  private void turnLeft() {
    int newDirIndex = directionMap.indexOf(pos.getDir())-1;
    if (newDirIndex < 0) {
      newDirIndex = newDirIndex + directionMap.size();
    }
    pos.setDir(directionMap.get(newDirIndex));
  }

  private void moveForward() {
    switch (pos.getDir()) {
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
      default:
//        break;
    }
  }

  public String getStatus() {
    return pos.toString();
  }
}
