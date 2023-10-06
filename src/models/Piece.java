package models;

import enums.Side;
import enums.pieceName;

public abstract class Piece {

     private Side side;
     private Square square;

     public Piece(Side side){
          this.side = side;
     }

     public abstract String getSymbol();

     public Side getSide() {
          return side;
     }
}
