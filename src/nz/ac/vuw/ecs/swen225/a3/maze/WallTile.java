package nz.ac.vuw.ecs.swen225.a3.maze;

import java.awt.*;

public class WallTile extends GenericTile {

    public WallTile(int x, int y) {
        super(x,y);
        setIcon("Wall");
        setWalkable(false);
        setKillsPlayer(false);
    }

    /**
     * Wall can't move
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
        return "Wall Tile";
    }

}
