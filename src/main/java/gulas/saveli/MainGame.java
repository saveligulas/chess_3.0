package gulas.saveli;

import gulas.saveli.Board.Tile;
import gulas.saveli.pieces.Pawn;

public class MainGame {
    public static void main(String[] args) {
        Pawn pTest = new Pawn(false, (byte) 0);
        System.out.println(pTest.getPawnNameFromStartingPosition());
        System.out.println(pTest.toString());
        Tile[] tiles = Tile.getStandard64Tiles();
        for(Tile tile : tiles) {
            if(tile == null) {
                System.out.println("ERROR: Tile is null");
            } else {
                System.out.println(tile.toString() + " | " + tile.getX_coordinate() + " | " + tile.getY_coordinate());
                byte y = tile.getY_coordinate();
                byte x = tile.getX_coordinate();
                byte index = Tile.getIndex(x, y);
                if(tiles[index] == tile) {
                    System.out.println("Successful");
                } else {
                    System.out.println("Unsuccessful");
                }
            }
        }
    }
}