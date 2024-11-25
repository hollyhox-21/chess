import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PawnTest {
    @Test
    void canMoveToPosition() {
        Pawn pawnWhite = new Pawn(ChessPiece.WHITE);
        ChessBoard chessBoard = new ChessBoard(ChessPiece.WHITE);
        Assertions.assertTrue(pawnWhite.canMoveToPosition(chessBoard, 3, 3, 4, 3));
        Assertions.assertTrue(pawnWhite.canMoveToPosition(chessBoard, 1, 3, 2, 3));
        Assertions.assertTrue(pawnWhite.canMoveToPosition(chessBoard, 1, 3, 3, 3));

        Pawn pawnBlack = new Pawn(ChessPiece.BLACK);
        Assertions.assertTrue(pawnBlack.canMoveToPosition(chessBoard, 3, 3, 2, 3));
        Assertions.assertTrue(pawnBlack.canMoveToPosition(chessBoard, 6, 3, 5, 3));
        Assertions.assertTrue(pawnBlack.canMoveToPosition(chessBoard, 6, 3, 4, 3));
    }
}