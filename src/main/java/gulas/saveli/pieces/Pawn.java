package gulas.saveli.pieces;

import gulas.saveli.model.Piece;
import gulas.saveli.model.Piece_Type;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        setType(Piece_Type.PAWN);
        if (isWhite) {
            setColorToWhite();
        } else {
            setColorToBlack();
        }
    }
}
