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
        marsRover.executeCommand("M");
        // Then
        Location expectedLocation = new Location(0, 1, Direction.N);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_forward_south_when_executeCommand_given_M() {
        // Given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("M");
        // Then
        Location expectedLocation = new Location(0, -1, Direction.S);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_forward_east_when_executeCommand_given_E() {
        // Given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("M");
        // Then
        Location expectedLocation = new Location(1, 0, Direction.E);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_forward_west_when_executeCommand_given_E() {
        // Given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("M");
        // Then
        Location expectedLocation = new Location(-1, 0, Direction.W);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_west_when_executeCommand_given_L() {
        // Given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("L");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.W);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_east_when_executeCommand_given_L() {
        // Given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("L");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.E);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_north_when_executeCommand_given_L() {
        // Given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("L");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.N);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_south_when_executeCommand_given_L() {
        // Given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("L");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.S);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_east_when_executeCommand_given_R() {
        // Given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("R");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.E);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_west_when_executeCommand_given_R() {
        // Given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("R");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.W);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_south_when_executeCommand_given_R() {
        // Given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("R");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.S);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_turn_to_north_when_executeCommand_given_R() {
        // Given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("R");
        // Then
        Location expectedLocation = new Location(0, 0, Direction.N);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_backward_north_when_executeCommand_given_M() {
        // Given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("B");
        // Then
        Location expectedLocation = new Location(0, -1, Direction.N);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_backward_south_when_executeCommand_given_M() {
        // Given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("B");
        // Then
        Location expectedLocation = new Location(0, 1, Direction.S);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_backward_east_when_executeCommand_given_E() {
        // Given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("B");
        // Then
        Location expectedLocation = new Location(-1, 0, Direction.E);
        assertEquals(location, expectedLocation);
    }

    @Test
    void should_move_backward_west_when_executeCommand_given_E() {
        // Given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand("B");
        // Then
        Location expectedLocation = new Location(1, 0, Direction.W);
        assertEquals(location, expectedLocation);
    }

//    @Test
//    void should_executes_the_complete_batch_of_commands() {
//        // Given
//        Location location = new Location(0, 0, Direction.W);
//        MarsRover marsRover = new MarsRover(location);
//        // When
//        marsRover.executeCommand("B");
//        // Then
//        Location expectedLocation = new Location(1, 0, Direction.W);
//        assertEquals(location, expectedLocation);
//    }

}
