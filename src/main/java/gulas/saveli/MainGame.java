package gulas.saveli;

import de.gurkenlabs.litiengine.Game;
import gulas.saveli.Board.LogicTile;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MainGame {
    public static void main(String[] args) {
        Game.init(args);
        Game.start();
        LogicTile[] logicTiles = LogicTile.getStandard64Tiles();
        for(LogicTile logicTile : logicTiles) {
            if(logicTile == null) {
                System.out.println("ERROR: Tile is null");
            } else {
                System.out.println(logicTile.toString() + " | " + logicTile.getX_coordinate() + " | " + logicTile.getY_coordinate());
                byte y = logicTile.getY_coordinate();
                byte x = logicTile.getX_coordinate();
                byte index = LogicTile.getIndex(x, y);
                System.out.println(logicTiles[index].toString() + " | " + logicTiles[index].getX_coordinate() + " | " + logicTiles[index].getY_coordinate());
                System.out.println();
            }
        }
    }
}