public class Queen extends ChessPiece {
    public Queen(String color) {
        super.symbol = "Q";
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

        if (line == toLine) {
            for (int i = Math.min(column, toColumn) + 1; i < Math.max(column, toColumn); i++) {
                if (chessBoard.board[line][i] != null) {
                    return false;
                }
            }
        } else if (column == toColumn) {
            for (int i = Math.min(line, toLine) + 1; i < Math.max(line, toLine); i++) {
                if (chessBoard.board[i][column] != null) {
                    return false;
                }
            }
        }

        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].color.equals(this.color)) {
            return false;
        }
        // проверка правильности хода
        return line == toLine || column == toColumn || Math.abs(line - toLine) == Math.abs(column - toColumn);
    }
}
