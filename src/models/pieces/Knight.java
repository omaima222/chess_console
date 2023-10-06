package models.pieces;

import models.Piece;
import  enums.Side;
import  enums.pieceName;

public class Knight extends Piece {
    private String symbol;
    private final int points = 3;
    public Knight(Side side) {
        super(side);
    }
    public int getPoints() {
        return points;
    }
    public String getSymbol(){
        return getSide().equals(Side.Black) ? " ♘ " : " ♞ ";
    }
}
