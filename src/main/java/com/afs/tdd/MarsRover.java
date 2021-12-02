package com.afs.tdd;

public class MarsRover {
//  final HashMap DirectionMap: {
//    NORTH: 'N', EAST: 'E',
//      SOUTH: 'S', WEST: 'W'}
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
      case 'L': {}
      case 'R': {}
    }
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
