package gulas.saveli.model;

import lombok.Data;

@Data
public class Piece implements PieceMovement {
    private Piece_Type type;
    private char color;
    private byte  column;
    private byte row;

    @Override
    public void movePiece(byte x_coordinate, byte y_coordinate) {

    }

    @Override
    public void removeFromBoard() {

    }
}
