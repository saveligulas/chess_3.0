package gulas.saveli.model;

public interface PieceInterface {
    byte MAX_COORDINATE_VALUE = 7;
    char[] ALLOWED_COLORS = new char[] {'B', 'W'};

    public void removeFromBoard();
}
