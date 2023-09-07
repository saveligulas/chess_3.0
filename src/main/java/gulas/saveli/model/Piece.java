package gulas.saveli.model;

import gulas.saveli.error.InvalidColorException;
import gulas.saveli.error.InvalidCoordinateException;
import lombok.Data;

@Data
public class Piece implements PieceMovement {
    private Piece_Type type;
    private char color;
    private byte column;
    private byte row;

    public void setColor(char color) {
        if(color == ALLOWED_COLORS[0] || color == ALLOWED_COLORS[1]) {

        } else {
            throw new InvalidColorException();
        }
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
