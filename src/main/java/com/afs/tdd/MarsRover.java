package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        if (command == Command.M) {
            move();
        }
        if (command == Command.L) {
            turnLeft();
        }
        if (command == Command.R) {
            turnRight();
        }
    }

    private void turnRight() {
        location.setDirection(location.getDirection().turnRight());
    }

    private void turnLeft() {
        location.setDirection(location.getDirection().turnLeft());
    }

    private void move() {
        if (this.location.getDirection() == Direction.N) {
            location.setLocationY(location.getLocationY() + 1);
        }
        if (this.location.getDirection() == Direction.S) {
            location.setLocationY(location.getLocationY() - 1);
        }
        if (this.location.getDirection() == Direction.E) {
            location.setLocationX(location.getLocationX() + 1);
        }
        if (this.location.getDirection() == Direction.W) {
            location.setLocationX(location.getLocationX() - 1);
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
