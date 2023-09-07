package gulas.saveli.pieces;

import gulas.saveli.model.Piece;
import gulas.saveli.model.Piece_Type;

public class Pawn extends Piece implements MovementInterface {
    public Pawn(boolean isWhite) {
        setType(Piece_Type.PAWN);
        if (isWhite) {
            setColorToWhite();
        } else {
            setColorToBlack();
        }
    }



    @Override
    public boolean checkIfSquareIsAccessible(byte x_coordinate, byte y_coordinate) {
        if (getColor() == 'b') {

        }

        return false;
    }
}
