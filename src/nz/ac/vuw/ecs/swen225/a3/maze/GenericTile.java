package nz.ac.vuw.ecs.swen225.a3.maze;

import javax.swing.*;
import java.awt.*;

public abstract class GenericTile {

    private int x;
    private int y;

    /**
     * 0 = background
     * 1 = middle
     * 2 = foreground
     */
    private int layer;

    private boolean isWalkable;
    private boolean killsPlayer;

    private String iconsPath = "src\\nz\\ac\\vuw\\ecs\\swen225\\a3\\maze\\icons\\";

    ImageIcon asset;

    public GenericTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setIcon(String assetName) {
        this.asset = new ImageIcon(iconsPath + assetName + ".png");
    }

    public void setWalkable(boolean isWalkable) {
        this.isWalkable = isWalkable;
    }

    public void setKillsPlayer(boolean killsPlayer) {
        this.killsPlayer = killsPlayer;
    }

    public void setLayer(int layer) throws NumberFormatException {
        if (layer < 3 && layer > -1) {
            this.layer = layer;
        }
        else {
            throw new NumberFormatException("Layer should be between 0-2 (Input: " + layer + ")");
        }
    }




    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * How the tile would move if it can and if the move is valid returns true
     * @return
     */
    public abstract boolean move(Point point);



    public abstract String toString();

}
