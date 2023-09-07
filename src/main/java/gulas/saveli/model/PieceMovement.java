package gulas.saveli.model;

public interface PieceMovement {
    byte MAX_COORDINATE_VALUE = 7;
    char[] ALLOWED_COLORS = new char[] {'B', 'W'};

    public void movePiece(byte x_coordinate, byte y_coordinate);
    public void removeFromBoard();
}
