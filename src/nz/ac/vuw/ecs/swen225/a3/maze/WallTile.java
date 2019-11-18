package nz.ac.vuw.ecs.swen225.a3.maze;

public class WallTile extends GenericTile {

    public WallTile() {
        super(0,0,true,false,null);
    }

    @Override
    public String toString() {
        return "Wall Tile";
    }

}
