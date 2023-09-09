package gulas.saveli.pieces;

import gulas.saveli.error.CoordinateOutOfBoundsException;
import gulas.saveli.model.Piece;
import gulas.saveli.model.Piece_Type;
import lombok.Setter;

public class Pawn extends Piece {
    @Setter
    private byte startingColumn;

    public Pawn(boolean isWhite, byte positionColumn) {
        setType(Piece_Type.PAWN);
        if (isWhite) {
            setColorToWhite();
            setRow((byte) 1);
        } else {
            setColorToBlack();
            setRow((byte) 6);
        }

        if (positionColumn >=0 && positionColumn <= MAX_COORDINATE_VALUE) {
            setColumn(positionColumn);
            setStartingColumn(positionColumn);
        } else {
            throw new CoordinateOutOfBoundsException();
        }
    }

    public String getPawnNameFromStartingPosition() {
        return COLUMN_CHARACTERS[startingColumn] + "-" + "Pawn";
    }
}
