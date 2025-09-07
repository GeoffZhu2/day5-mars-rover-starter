package com.afs.tdd;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommands(String commands) {
        if (commands == null || commands.isEmpty()) {
            return;
        }
        if (!commands.matches("[MBLR]*")) {
            throw new RuntimeException("Error Command: " + commands);
        }
        for (char command: commands.toCharArray()) {
            executeSingleCommand(command);
        }
    }

    private void executeSingleCommand(char command) {
        if (command == 'M') {
            moveForward();
        }
        if(command == 'B') {
            moveBackward();
        }
        if (command == 'L') {
            turnLeft();
        }
        if (command == 'R') {
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
