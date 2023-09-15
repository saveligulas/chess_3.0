package gulas.saveli;

import de.gurkenlabs.litiengine.Game;
import gulas.saveli.Board.Tile;
import gulas.saveli.pieces.Pawn;

public class MainGame {
    public static void main(String[] args) {
        Game.init(args);
        Game.start();
        Tile[] tiles = Tile.getStandard64Tiles();
        for(Tile tile : tiles) {
            if(tile == null) {
                System.out.println("ERROR: Tile is null");
            } else {
                System.out.println(tile.toString() + " | " + tile.getX_coordinate() + " | " + tile.getY_coordinate());
                byte y = tile.getY_coordinate();
                byte x = tile.getX_coordinate();
                byte index = Tile.getIndex(x, y);
                System.out.println(tiles[index].toString() + " | " + tiles[index].getX_coordinate() + " | " + tiles[index].getY_coordinate());
                System.out.println();
            }
        }
    }
}