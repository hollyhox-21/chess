public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super.symbol = "B";
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

        int j = Math.max(column, toColumn) - 1;
        for (int i = Math.min(line, toLine) + 1; i < Math.max(line, toLine); i++) {
            if (i > Math.min(line, toLine)) {
                if (chessBoard.board[i][j] != null) {
                    return false;
                }
                if (j > Math.min(column, toColumn)) {
                    j--;
                }
            }
        }

        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].color.equals(this.color)) {
            return false;
        }

        // проверка правильности хода слона
        return Math.abs(line - toLine) == Math.abs(column - toColumn);
    }
}
