package nz.ac.vuw.ecs.swen225.a3.render.view;

import nz.ac.vuw.ecs.swen225.a3.maze.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Random;

/**
 * this class is a custom canvas, this is where the tiles will be displayed and the game will take place
 * @author Joshua Harwood
 */
public class BoardCanvas extends Canvas {

    private int tileSize = 32;
    private Tile[][] tiles;
    private int tilesW, tilesH;

    /**
     * constructor
     * @param tiles - the tiles array
     */
    public BoardCanvas(Tile[][] tiles) {
        this.tiles = tiles;
        this.tilesW = tiles[0].length;
        this.tilesH = tiles.length;
        this.setSize(tilesW*tileSize, tilesH*tileSize);
    }

    /**
     * when called this will go through the board and draw each tile. and scale them to fit
     * @param g - the graphics object to be drawn on
     * @param w - the width of the plane behind (so that we can scale to fit that)
     * @param h - the height of the plane behind (so that we can scale to fit that)
     */
    public void drawBoard(Graphics g, int w, int h) {
        System.out.println("DRAWING     WIDTH: " + tilesW + "  HEIGHT: " + tilesH);

        int scaledSizeW = w / tilesW; //finding the scaled width
        int scaledSizeH = h / tilesH; //finding the scaled height
        tileSize = (scaledSizeH < scaledSizeW) ? scaledSizeH : scaledSizeW; //get the smallest of the 2 (so we dont draw off the edge)
        this.setSize(scaledSizeW * tilesW, scaledSizeH * tilesH); //set the size

        //go through each of the tiles and draw them
        for (int i = 0; i < tilesW; i++) {
            for (int j = 0; j < tilesH; j++) {
//
                Image tileImg = tiles[j][i].getImage(); // get the image
                int x = i * tileSize; //work the X and Y
                int y = j * tileSize;

                g.drawImage(tileImg, x, y, tileSize, tileSize, null); //draw the image
            }
        }

    }

    public void updateTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }
}
