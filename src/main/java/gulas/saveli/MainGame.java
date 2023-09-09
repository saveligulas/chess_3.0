package gulas.saveli;

import gulas.saveli.pieces.Pawn;

public class MainGame {
    public static void main(String[] args) {
        Pawn pTest = new Pawn(false, (byte) 0);
        System.out.println(pTest.getPawnNameFromStartingPosition());
        System.out.println(pTest.toString());
    }
}