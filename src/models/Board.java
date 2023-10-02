package models;

import java.lang.reflect.Array;

public class Board {
    private String[] lineA = {" ♖ "," ♙ ","    ","  ","  ","  "," ♟ "," ♜ ",};
    private String[] lineB = {" ♘ "," ♙ ","  ","  ","  ","  "," ♟ "," ♞ "};
    private String[] lineC = {" ♗ "," ♙ ","  ","  ","  ","  "," ♟ "," ♝ "};
    private String[] lineD = {" ♕ "," ♙ ","  ","  ","  ","  "," ♟ "," ♛ "};
    private String[] lineE = {" ♔ "," ♙ ","  ","  ","  ","  "," ♟ "," ♚ "};
    private String[] lineF = {" ♗ "," ♙ ","  ","  ","  ","  "," ♟ "," ♝ "};
    private String[] lineG = {" ♘ "," ♙ ","  ","  ","  ","  "," ♟ "," ♞ "};
    private String[] lineH = {" ♖ "," ♙ ","  ","  ","  ","  "," ♟ "," ♜ "};

    private String[][] lines = {lineA,lineB,lineC,lineD,lineE,lineF,lineG,lineH};

    public String[][] getLines(){
        return this.lines;
    }

    public void initialBoard(String[][] cases){
        System.out.println("♔ king, ♕ queen, ♖ rook, ♗ bishop, ♘ knight and ♙ pawn.");
        System.out.println("♚ king, ♛ queen, ♜ rook, ♝ bishop, ♞ knight and ♟ pawn.");

        System.out.println("     1    2    3    4    5   6    7    8");
        System.out.println("  +------------------------------------+");
        System.out.println("8 |"+cases[0][7]+"|"+cases[1][7]+"|"+cases[2][7]+"|"+cases[3][7]+"|"+cases[4][7]+"|"+cases[5][7]+"|"+cases[6][7]+"|"+cases[7][7]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("7 |"+cases[0][6]+"|"+cases[1][6]+"|"+cases[2][6]+"|"+cases[3][6]+"|"+cases[4][6]+"|"+cases[5][6]+"|"+cases[6][6]+"|"+cases[7][6]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("6 |"+cases[0][5]+"|"+cases[1][5]+"|"+cases[2][5]+"|"+cases[3][5]+"|"+cases[4][5]+"|"+cases[5][5]+"|"+cases[6][5]+"|"+cases[7][5]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("5 |"+cases[0][4]+"|"+cases[1][4]+"|"+cases[2][4]+"|"+cases[3][4]+"|"+cases[4][4]+"|"+cases[5][4]+"|"+cases[6][4]+"|"+cases[7][4]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("4 |"+cases[0][3]+"|"+cases[1][3]+"|"+cases[2][3]+"|"+cases[3][3]+"|"+cases[4][3]+"|"+cases[5][3]+"|"+cases[6][3]+"|"+cases[7][3]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("3 |"+cases[0][2]+"|"+cases[1][2]+"|"+cases[2][2]+"|"+cases[3][2]+"|"+cases[4][2]+"|"+cases[5][2]+"|"+cases[6][2]+"|"+cases[7][2]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("2 |"+cases[0][1]+"|"+cases[1][1]+"|"+cases[2][1]+"|"+cases[3][1]+"|"+cases[4][1]+"|"+cases[5][1]+"|"+cases[6][1]+"|"+cases[7][1]+"|");
        System.out.println("  +------------------------------------+");
        System.out.println("1 |"+cases[0][0]+"|"+cases[1][0]+"|"+cases[2][0]+"|"+cases[3][0]+"|"+cases[4][0]+"|"+cases[5][0]+"|"+cases[6][0]+"|"+cases[7][0]+"|");
        System.out.println("  +------------------------------------+");
    }

}
