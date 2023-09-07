package gulas.saveli.pieces;

import gulas.saveli.model.Piece;
import gulas.saveli.model.Piece_Type;

public class Pawn extends Piece implements MovementInterface {
    public Pawn() {
        setType(Piece_Type.PAWN);
    }



    @Override
    public boolean checkIfSquareIsAccessible(byte x_coordinate, byte y_coordinate) {
        return false;
    }
}
