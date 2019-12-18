package nz.ac.vuw.ecs.swen225.a3.maze;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

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

    //TODO: VERY IMPORTANT TO FIX
    public static GenericTile getTileSubclass(TileType t, int x, int y) {
        if (t == TileType.Empty)
            return new EmptyTile(x,y);
        else
            return new WallTile(x,y);
    }

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



    private Map<String, ImageIcon> tileMap = new HashMap<>();

    /**
     * Gets the image associated with this tile.
     * @return the image
     */
    public Image getImage() {
        return asset.getImage();
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
     * TODO: add logic?
     * TODO: other directions
     * TODO: could be used for move() method
     * @return
     */
    public Point south() {
        return new Point(this.x, this.y+1);
    }

    /**
     * How the tile would move if it can and if the move is valid returns true
     * @return
     */
    public abstract boolean move(Point point);

    /**
     * Logic for interacting with this tile
     * @return
     */
    public abstract boolean interact();

    /**
     * TODO: re-look at this, probably a bad way to do things
     * @return
     */
    public GenericTile pickup() {
        return this;
    }

    public abstract String toString();

}
