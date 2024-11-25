import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HorseTest {

    @Test
    void canMoveToPosition() {
        Horse horse = new Horse("white");
        ChessBoard chessBoard = new ChessBoard(ChessPiece.WHITE);
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 5, 4));
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 1, 4));
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 1, 2));
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 5, 2));

        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 4, 1));
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 4, 5));
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 2, 1));
        Assertions.assertTrue(horse.canMoveToPosition(chessBoard, 3, 3, 2, 5));
    }

    @Test
    void canMoveToPositionFalse() {
        Horse horse = new Horse("white");
        ChessBoard chessBoard = new ChessBoard(ChessPiece.WHITE);
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 0, 0, 0, 0));
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 3, 3, 5, 1));
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 3, 3, 5, 3));
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 3, 3, 5, 5));
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 3, 3, 4, 2));
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 3, 3, 4, 3));
        Assertions.assertFalse(horse.canMoveToPosition(chessBoard, 3, 3, 4, 4));
    }
}