package models.pieces;

import models.Piece;
import models.Board;
import enums.pieceName;

public class Rook {

     Piece Rook = new Piece(pieceName.Rook,"♜",5);
     String color;

     public boolean move(String position, Board board){
         String x = position;
         return true;
     }

}
