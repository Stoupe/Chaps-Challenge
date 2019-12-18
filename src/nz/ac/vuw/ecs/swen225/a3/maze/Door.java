package nz.ac.vuw.ecs.swen225.a3.maze;

import java.awt.*;

public class Door extends GenericTile {

    private int doorId;

    public Door(int x, int y) {
        super(x, y);
    }

    /**
     * How the tile would move if it can and if the move is valid returns true
     *
     * @param point
     * @return
     */
    @Override
    public boolean move(Point point) {
        return false;
    }

    /**
     * Logic for interacting with this tile
     *
     * @return
     */
    @Override
    public boolean interact() {
        return false;
    }

    @Override
    public String toString() {
        return "Door";
    }
}
