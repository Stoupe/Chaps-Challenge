package nz.ac.vuw.ecs.swen225.a3.maze;

import org.junit.jupiter.api.Test;

public class TileTester {


    @Test
    public static void main(String[] args) {

        WallTile tile = new WallTile(0,0);



        EmptyTile tile2 = new EmptyTile(1,0);
        GenericTile tile3 = new EmptyTile(5,5);

        System.out.println(tile);
        System.out.println(tile2);
        System.out.println(tile3);

        System.out.println(tile.getX());
        System.out.println(tile2.getX());
        System.out.println(tile3.getX());

    }

}
