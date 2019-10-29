package nz.ac.vuw.ecs.swen225.a3.maze;

import org.junit.jupiter.api.Test;

public class TileTester {


    @Test
    public static void main(String[] args) {

        WallTile tile = new WallTile();

        System.out.println(tile.toString());
        System.out.println(tile.getX());

    }

}
