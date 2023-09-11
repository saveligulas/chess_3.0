package gulas.saveli;

import gulas.saveli.Board.Tile;
import gulas.saveli.pieces.Pawn;

public class MainGame {
    public static void main(String[] args) {
        Pawn pTest = new Pawn(false, (byte) 0);
        System.out.println(pTest.getPawnNameFromStartingPosition());
        System.out.println(pTest.toString());
        for(Tile tile : Tile.getStandard64Tiles()) {
            if(tile == null) {
                System.out.println("ERROR: Tile is null");
            } else {
                System.out.println(tile.toString() + " | " + tile.getX_coordinate() + " | " + tile.getY_coordinate());
            }

        }
    }
}