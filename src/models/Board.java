package models;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {

    private Square[][] board;

    public Board() {
        this.board = new Square[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new Square(i,j);
            }
        }
    }

    public Square[][] getBoard(){
        return this.board;
    }

}
