package gulas.saveli.Board;

import lombok.Data;

@Data
public class ChessBoard {
    private final Tile[] tiles;

    private boolean moveOrderIsWhite = true;

    public ChessBoard() {
        this.tiles = Tile.getStandard64Tiles();
    }
}
