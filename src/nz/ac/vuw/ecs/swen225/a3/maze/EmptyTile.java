package nz.ac.vuw.ecs.swen225.a3.maze;

import java.awt.*;

//TODO: Rename FloorTile**

public class EmptyTile extends GenericTile {

    public EmptyTile(int x, int y) {
        super(x,y);
        setIcon("Empty");
        setWalkable(true);
        setKillsPlayer(false);
    }

    /**
     * Floor tile can't move
     *
     * @param point
     * @return
     */
    @Override
    public boolean move(Point point) {
        return false;
    }

    @Override
    public String toString() {
        return "Empty Tile";
    }
}
