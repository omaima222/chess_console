package models.pieces;

import enums.Side;
import models.Piece;
import  enums.pieceName;


public class Pawn extends Piece {
    private String symbol;
    private final int points = 1;
    public Pawn(Side side) {
        super(side);
    }
    public int getPoints() {
        return points;
    }
    public String getSymbol(){
        return getSide().equals(Side.Black) ? " ♙ " : " ♟ ";
    }
}
