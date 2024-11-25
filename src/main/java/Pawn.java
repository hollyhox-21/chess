import java.util.Objects;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super.symbol = "P";
        super.color = color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // проверка валидации позиции
        if (!chessBoard.checkPos(line) ||!chessBoard.checkPos(column) || !chessBoard.checkPos(toLine) || !chessBoard.checkPos(toColumn))
            return false;
        // проверка на то, что фигура не ходит на свою позицию
        if (line == toLine && column == toColumn) {
            return false;
        }

        if (this.color.equals(WHITE) && ((line - toLine == -1 && column - toColumn == -1) || (line - toLine == -1 && column - toColumn == 1))) {
            return chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].color.equals(BLACK);
        } else if (this.color.equals(BLACK) && ((line - toLine == 1 && column - toColumn == -1) || (line - toLine == 1 && column - toColumn == 1))) {
            return chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].color.equals(WHITE);
        }

        if (this.color.equals(WHITE) && line == 1) {
            return (line - toLine == -2 || line - toLine == -1) && column == toColumn;
        } else if (this.color.equals(BLACK) && line == 6) {
            return (line - toLine == 2 || line - toLine == 1) && column == toColumn;
        }

        if (this.color.equals(WHITE) && chessBoard.board[toLine][toColumn] == null) {
           return line - toLine == -1 && column == toColumn;
        } else if (this.color.equals(BLACK) && chessBoard.board[toLine][toColumn] == null) {
            return line - toLine == 1 && column == toColumn;
        }

        return false;
    }
}
