package services;

import enums.Side;
import models.Board;
import models.Square;
import models.pieces.*;


public class BoardService {

    private Square[][] board = new Board().getBoard();

    private void starterBoard(){
        this.board[0][7].setAll(new Rook(Side.Black), 1,8);
        this.board[1][7].setAll(new Knight(Side.Black), 2,8);
        this.board[2][7].setAll(new Bishop(Side.Black), 3,8);
        this.board[3][7].setAll(new Queen(Side.Black), 4,8);
        this.board[4][7].setAll(new King(Side.Black), 5,8);
        this.board[5][7].setAll(new Bishop(Side.Black), 6,8);
        this.board[6][7].setAll(new Knight(Side.Black), 7,8);
        this.board[7][7].setAll(new Rook(Side.Black), 8,8);

        for (int i = 0; i < board.length; i++) {
            this.board[i][6].setAll(new Pawn(Side.Black), i,7);
        }

        this.board[0][0].setAll(new Rook(Side.White), 1,1);
        this.board[1][0].setAll(new Knight(Side.White), 2,1);
        this.board[2][0].setAll(new Bishop(Side.White), 3,1);
        this.board[3][0].setAll(new Queen(Side.White), 4,1);
        this.board[4][0].setAll(new King(Side.White), 5,1);
        this.board[5][0].setAll(new Bishop(Side.White), 6,1);
        this.board[6][0].setAll(new Knight(Side.White), 7,1);
        this.board[7][0].setAll(new Rook(Side.White), 8,1);

        for (int i = 0; i < board.length; i++) {
            this.board[i][1].setAll(new Pawn(Side.White), i,1);
        }

    }

    public void displayBoard(){
        starterBoard();
        System.out.println("♔ king, ♕ queen, ♖ rook, ♗ bishop, ♘ knight and ♙ pawn.");
        System.out.println("♚ king, ♛ queen, ♜ rook, ♝ bishop, ♞ knight and ♟ pawn.");

        System.out.println("     a    b    c    d    e   f    g    h");
        System.out.println("  +------------------------------------+");

        for(int i=board.length-1;i>=0;i--){
            String s="";
            for (int j = 0; j < board.length; j++) {
                String boardSquare = (board[j][i].getPiece()==null)?"    ":board[j][i].getPiece().getSymbol();
                s+=boardSquare+"|";
            }
            System.out.println((i+1)+" |"+s);
            System.out.println("  +------------------------------------+");
        }

    }

}
