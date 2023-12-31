package models.pieces;

import enums.Side;
import enums.pieceName;
import models.Piece;

public class King extends Piece{
    private String symbol;
    private final int points = 0;
    public King(Side side) {
        super(side);
    }
    public int getPoints() {
        return points;
    }
    public String getSymbol(){
        return getSide().equals(Side.Black) ? " ♔ " : " ♚ ";
    }
}
