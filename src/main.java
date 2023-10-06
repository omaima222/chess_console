
import models.Board;
import models.pieces.Rook;
import services.BoardService;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        new BoardService().displayBoard();
    }
}
