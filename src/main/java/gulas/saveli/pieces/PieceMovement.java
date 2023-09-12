package gulas.saveli.pieces;

import gulas.saveli.Board.ChessBoard;
import gulas.saveli.Board.Tile;
import gulas.saveli.error.InvalidTileSelectionException;
import gulas.saveli.model.Piece;
import gulas.saveli.model.PieceInterface;
import gulas.saveli.model.Piece_Type;

public class PieceMovement implements PieceInterface {

    public ChessBoard returnUpdatedBoard(ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection, byte x_coordinate_target, byte y_coordinate_target ) {
        boolean playerIsWhite = board.isMoveOrderIsWhite();

        try {
            pieceOnSelectedTileHasPlayersColorAndTileIsNotEmpty(playerIsWhite, board, x_coordinate_selection, y_coordinate_selection);
            Piece_Type piece_type = getPieceTypeOfSelectedTile(board, x_coordinate_selection, y_coordinate_selection);
        } catch (InvalidTileSelectionException e) {
            System.out.println(e.getMessage());
            return null;
        }

        return board;
    }

    private void pieceOnSelectedTileHasPlayersColorAndTileIsNotEmpty(boolean colorIsWhite, ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection) {
        Tile[] boardTiles = board.getTiles();
        Tile selectedTile = boardTiles[Tile.getIndex(x_coordinate_selection, y_coordinate_selection)];
        if(selectedTile.getPieceOnTile().isColorIsWhite() != colorIsWhite) {
            throw new InvalidTileSelectionException();
        }
    }

    private Piece_Type getPieceTypeOfSelectedTile(ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection) {
        Tile[] boardTiles = board.getTiles();
        Tile selectedTile = boardTiles[Tile.getIndex(x_coordinate_selection, y_coordinate_selection)];
        if(selectedTile.getPieceOnTile() == null) {
            throw new InvalidTileSelectionException();
        }
        return selectedTile.getPieceOnTile().getType();
    }

    @Override
    public void removeFromBoard() {
    }
}
