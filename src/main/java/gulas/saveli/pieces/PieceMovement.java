package gulas.saveli.pieces;

import gulas.saveli.Board.ChessBoard;
import gulas.saveli.model.PieceInterface;

public class PieceMovement implements PieceInterface {

    public boolean pieceMovementWasSuccessful(ChessBoard board, byte x_coordinate_selection, byte y_coordinate_selection, byte x_coordinate_target, byte y_coordinate_target ) {

    }


    //TODO: implement ability to check if piece on board of specific type can move to given x and y coordinates - and add ability to check if the king is in check

    @Override
    public void removeFromBoard() {
    }
}
