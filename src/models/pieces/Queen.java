package models.pieces;

import enums.Side;
import models.Piece;
import  enums.pieceName;

public class Queen extends Piece {
    private String symbol;
    private final int points = 9;
    public Queen(Side side) {
        super(side);
    }
    public int getPoints() {
        return points;
    }
    public String getSymbol(){
        return getSide().equals(Side.Black) ? " ♕ " : " ♛ ";
    }
}
