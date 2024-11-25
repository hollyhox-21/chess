public class Horse extends ChessPiece {
    public Horse(String color) {
        super.symbol = "H";
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

        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].color.equals(this.color)) {
            return false;
        }

        // проверка правильности хода конём
        return Math.abs(line - toLine) == 2 && Math.abs(column - toColumn) == 1 ||
                Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 2;
    }
}
