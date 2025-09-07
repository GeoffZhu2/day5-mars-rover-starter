package com.afs.tdd;

public class MarsRover {
    private static final String VALID_COMMANDS_PATTERN = "[MBLR]*";
    private Location location;
    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommands(String commands) {
        if (commands == null || commands.isEmpty()) {
            return;
        }
        if (!commands.matches(VALID_COMMANDS_PATTERN)) {
            throw new RuntimeException("Error Command: " + commands);
        }
        for (char command: commands.toCharArray()) {
            executeSingleCommand(command);
        }
    }

    private void executeSingleCommand(char command) {
        switch (command) {
            case 'M' -> moveForward();
            case 'B' -> moveBackward();
            case 'L' -> turnLeft();
            case 'R' -> turnRight();
        }
    }

    private void turnRight() {
        location.setDirection(location.getDirection().turnRight());
    }

    private void turnLeft() {
        location.setDirection(location.getDirection().turnLeft());
    }

    private void moveForward() {
        switch (location.getDirection()) {
            case N -> location.setLocationY(location.getLocationY() + 1);
            case S -> location.setLocationY(location.getLocationY() - 1);
            case E -> location.setLocationX(location.getLocationX() + 1);
            case W -> location.setLocationX(location.getLocationX() - 1);
        }
    }

    private void moveBackward() {
        switch (location.getDirection()) {
            case N -> location.setLocationY(location.getLocationY() - 1);
            case S -> location.setLocationY(location.getLocationY() + 1);
            case E -> location.setLocationX(location.getLocationX() - 1);
            case W -> location.setLocationX(location.getLocationX() + 1);
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
