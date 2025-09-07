package com.afs.tdd;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(String command) {
        if ("M".equals(command)) {
            moveForward();
        }
        if("B".equals(command)) {
            moveBackward();
        }
        if ("L".equals(command)) {
            turnLeft();
        }
        if ("R".equals(command)) {
            turnRight();
        }
    }

    private void turnRight() {
        location.setDirection(location.getDirection().turnRight());
    }

    private void turnLeft() {
        location.setDirection(location.getDirection().turnLeft());
    }

    private void moveForward() {
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

    private void moveBackward() {
        if (this.location.getDirection() == Direction.N) {
            location.setLocationY(location.getLocationY() - 1);
        }
        if (this.location.getDirection() == Direction.S) {
            location.setLocationY(location.getLocationY() + 1);
        }
        if (this.location.getDirection() == Direction.E) {
            location.setLocationX(location.getLocationX() - 1);
        }
        if (this.location.getDirection() == Direction.W) {
            location.setLocationX(location.getLocationX() + 1);
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
