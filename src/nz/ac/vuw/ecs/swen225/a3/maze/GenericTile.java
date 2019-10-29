package nz.ac.vuw.ecs.swen225.a3.maze;

import com.sun.istack.internal.NotNull;

import javax.swing.*;

public abstract class GenericTile {

    private int x;
    private int y;

    private boolean isWalkable;
    private boolean killsPlayer;

    ImageIcon asset = new ImageIcon("src\\nz\\ac\\vuw\\ecs\\swen225\\a3\\maze\\icons\\Wall.png");

    public GenericTile(int x, int y, boolean isWalkable, boolean killsPlayer, ImageIcon asset) {
        this.x = x;
        this.y = y;
        this.isWalkable = isWalkable;
        this.killsPlayer = killsPlayer;
        this.asset = asset;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public abstract String toString();

}
