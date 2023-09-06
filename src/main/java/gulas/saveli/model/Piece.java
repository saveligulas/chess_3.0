package gulas.saveli.model;

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

    public Piece_Type getType() {
        return type;
    }

    public void setType(Piece_Type type) {
        this.type = type;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public byte getColumn() {
        return column;
    }

    public void setColumn(byte column) {
        this.column = column;
    }

    public byte getRow() {
        return row;
    }

    public void setRow(byte row) {
        this.row = row;
    }
}
