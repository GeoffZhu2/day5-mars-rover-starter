package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_forward_north_when_executeCommand_given_M() {
        // Given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        // Then
        Location expectedLocation = new Location(0, 1, Direction.N);
        assertEquals(expectedLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(expectedLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(expectedLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_move_forward_south_when_executeCommand_given_M() {
        // Given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        // Then
        Location expectedLocation = new Location(0, -1, Direction.S);
        assertEquals(expectedLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(expectedLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(expectedLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_move_forward_east_when_executeCommand_given_E() {
        // Given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        // Then
        Location expectedLocation = new Location(1, 0, Direction.E);
        assertEquals(expectedLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(expectedLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(expectedLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_move_forward_west_when_executeCommand_given_E() {
        // Given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        // Then
        Location expectedLocation = new Location(-1, 0, Direction.W);
        assertEquals(expectedLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(expectedLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(expectedLocation.getDirection(), marsRover.getLocation().getDirection());
    }
}
