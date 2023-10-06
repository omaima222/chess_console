package models.pieces;

import models.Piece;
import models.Board;
import enums.Side;
import models.Square;
import  enums.pieceName;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rook extends Piece {
    private String symbol;
    private final int points = 5;
    private final pieceName name = pieceName.Rook;

    public Rook(Side side) {
        super(side);
    }
    public int getPoints() {
        return points;
    }
    public String getSymbol(){
        return getSide().equals(Side.Black) ? " ♖ " : " ♜ ";
    }

    public pieceName getName() {
        return name;
    }

    public List<Square> availableSquares(Integer x, Integer y, Board boardClass){
         List<Square> availableSquares = new ArrayList<>();
         Square[][] board = boardClass.getBoard();
         Arrays.stream(board).forEach(squares -> Arrays.stream(squares).forEach(square -> {
             if((square.getX()==x || square.getY()==y ) && square.getPiece()==null) availableSquares.add(square);
         }));
         return availableSquares;
    }

}
