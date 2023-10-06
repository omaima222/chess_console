package models;

public class Square {
    private int x;
    private int y;
    private Piece piece;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setAll(Piece piece, int x, int y) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public Piece getPiece() {
        return piece;
    }

}
