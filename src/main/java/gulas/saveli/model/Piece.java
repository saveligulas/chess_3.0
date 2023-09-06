package gulas.saveli.model;

import lombok.Data;

@Data
public class Piece implements PieceMovement {
    private Piece_Type type;
    private char color;
    private byte column;
    private byte row;

    @Override
    public void movePiece(byte x_coordinate, byte y_coordinate) {
        if(x_coordinate > 0 && x_coordinate <= MAX_COORDINATE_VALUE && y_coordinate > 0 && y_coordinate <= MAX_COORDINATE_VALUE);
    }

    @Override
    public void removeFromBoard() {
        this.column = -1;
        this.row = -1;
    }
}
