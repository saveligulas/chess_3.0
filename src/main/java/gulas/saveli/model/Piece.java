package gulas.saveli.model;

import gulas.saveli.error.InvalidColorException;
import gulas.saveli.error.InvalidCoordinateException;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Piece implements PieceMovement {
    private Piece_Type type;
    @Setter(AccessLevel.NONE)
    private char color;
    private byte column;
    private byte row;

    public void setColorToBlack() {
        this.color = 'b';
    }

    public void setColorToWhite() {
        this.color = 'w';
    }

    @Override
    public void movePiece(byte x_coordinate, byte y_coordinate) {
        if(x_coordinate > 0 && x_coordinate <= MAX_COORDINATE_VALUE && y_coordinate > 0 && y_coordinate <= MAX_COORDINATE_VALUE) {
            this.column = x_coordinate;
            this.row = y_coordinate;
        } else {
            throw new InvalidCoordinateException();
        }
    }

    @Override
    public void removeFromBoard() {
        this.column = -1;
        this.row = -1;
    }
}
