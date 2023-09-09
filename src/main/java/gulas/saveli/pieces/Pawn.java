package gulas.saveli.pieces;

import gulas.saveli.error.CoordinateOutOfBoundsException;
import gulas.saveli.model.Piece;
import gulas.saveli.model.Piece_Type;

public class Pawn extends Piece {
    public Pawn(boolean isWhite, byte positionColumn) {
        setType(Piece_Type.PAWN);
        if (isWhite) {
            setColorToWhite();
        } else {
            setColorToBlack();
        }

        if (positionColumn >=0 && positionColumn <= MAX_COORDINATE_VALUE) {

        } else {
            throw new CoordinateOutOfBoundsException();
        }
    }


}
