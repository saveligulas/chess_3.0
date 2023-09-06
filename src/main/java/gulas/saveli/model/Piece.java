package gulas.saveli.model;

public interface Piece {
    byte MAX_COORDINATE_VALUE = 63;

    public void movePiece(byte x_coordinate, byte y_coordinate);
    public void removeFromBoard();
}
