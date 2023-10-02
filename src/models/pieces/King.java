package models.pieces;

import enums.pieceName;
import models.Piece;

public class King {

    Piece King = new Piece(pieceName.King,"♜",0);
    public String color;

    public boolean move(String position){
        return true;
    }


}
