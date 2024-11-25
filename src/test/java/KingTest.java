import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KingTest {

    @Test
    void canMoveToPosition() {
        King king = new King("white");
        ChessBoard chessBoard = new ChessBoard();
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 4, 2));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 4, 3));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 4, 4));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 3, 2));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 3, 4));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 2, 2));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 2, 3));
        Assertions.assertTrue(king.canMoveToPosition(chessBoard, 3, 3, 2, 4));
    }

    @Test
    void canMoveToPositionFalse() {
        King king = new King("white");
        ChessBoard chessBoard = new ChessBoard();
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 0, 0, 0, 0));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 5, 1));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 5, 2));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 5, 3));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 5, 4));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 5, 5));

        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 4, 1));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 3, 1));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 2, 1));

        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 4, 5));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 3, 5));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 2, 5));

        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 1, 1));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 1, 2));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 1, 3));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 1, 4));
        Assertions.assertFalse(king.canMoveToPosition(chessBoard, 3, 3, 1, 5));
        }
}