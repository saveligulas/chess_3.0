package gulas.saveli.pieces;

import gulas.saveli.Board.ChessBoard;
import gulas.saveli.Board.Tile;
import gulas.saveli.error.InvalidTileSelectionException;
import gulas.saveli.model.Piece;
import gulas.saveli.model.PieceInterface;
import gulas.saveli.model.Piece_Type;

public class PieceMovement implements PieceInterface {

    public boolean pieceMovementWasSuccessful(ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection, byte x_coordinate_target, byte y_coordinate_target ) {
        boolean playerIsWhite = board.isMoveOrderIsWhite();

        try {
            pieceOnSelectedTileHasPlayersColorAndTileIsNotEmpty(playerIsWhite, board, x_coordinate_selection, y_coordinate_selection);
            Piece_Type piece_type = getPieceTypeOfSelectedTile(board, x_coordinate_selection, y_coordinate_selection);
        } catch (InvalidTileSelectionException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private void pieceOnSelectedTileHasPlayersColorAndTileIsNotEmpty(boolean colorIsWhite, ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection) {
        Tile[] boardTiles = board.getTiles();
        Piece piece = new Piece();
        if(piece.isColorIsWhite() != colorIsWhite) {
            throw new InvalidTileSelectionException();
        }
    }

    private Piece_Type getPieceTypeOfSelectedTile(ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection) {
        return Piece_Type.KING;
    }

    //TODO: implement ability to check if piece on board of specific type can move to given x and y coordinates - and add ability to check if the king is in check

    @Override
    public void removeFromBoard() {
    }
}
