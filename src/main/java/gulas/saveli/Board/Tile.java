package gulas.saveli.Board;

import gulas.saveli.model.Piece;
import lombok.Data;

@Data
public class Tile {
    private byte x_coordinate;
    private byte y_coordinate;

    private Piece pieceOnTile;

    public static Tile[] getStandard64Tiles() {
        Tile[] tiles = new Tile[64];
        for(byte rows = 0; rows < 8; rows++) {
            for(byte columns = 0; columns < 8; columns++) {
                byte index = (byte) ((rows*8)+columns);
                Tile tile = new Tile();
                tile.setY_coordinate(rows);
                tile.setX_coordinate(columns);
            }
        }
    }
}
