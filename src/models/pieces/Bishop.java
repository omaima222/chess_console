package models.pieces;

import enums.Side;
import models.Board;
import models.Square;
import models.Piece;
import enums.Side;
import  enums.pieceName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Bishop extends Piece{
    private String symbol;
    private final int points = 3;
    private final pieceName name = pieceName.Bishop;

    public Bishop(Side side) {
        super(side);
    }
    public int getPoints() {
        return points;
    }
    public pieceName getName() {
        return name;
    }
    public String getSymbol(){
        return getSide().equals(Side.Black) ? " ♗ " : " ♝ ";
    }
}
