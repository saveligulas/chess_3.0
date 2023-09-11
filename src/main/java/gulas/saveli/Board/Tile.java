package gulas.saveli.Board;

import lombok.Data;

@Data
public class Tile {
    private byte x_coordinate;
    private byte y_coordinate;

    public static Tile[] getStandard64Tiles() {
        Tile[] tiles = new Tile[64];
        for(int rows = 0; rows < 8; rows++) {
            for(int columns = 0; columns < 8; columns++) {
                tiles[]
            }
        }
    }
}
