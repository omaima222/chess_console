package models;

import enums.pieceName;

public class Piece {
     private pieceName name;
     private String symbol;
     private int points;
     public Piece(pieceName name,String symbol,int points){
          this.name = name;
          this.symbol = symbol;
          this.points = points;
     }

     public boolean move(){
          return true;
     }

}
