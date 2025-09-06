package com.afs.tdd;

public enum Direction {
    N, S, W, E;
    public Direction turnLeft() {
        return switch (this) {
            case N -> W;
            case S -> E;
            case E -> N;
            case W -> S;
        };
    }
}
