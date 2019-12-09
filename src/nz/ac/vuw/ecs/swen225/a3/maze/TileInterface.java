package nz.ac.vuw.ecs.swen225.a3.maze;

public interface TileInterface {

    int x = 0;

    default int getX() {
        return x;
    }

}
