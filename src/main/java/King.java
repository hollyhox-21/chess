public class King extends ChessPiece {
    public King(String color) {
        super.symbol = "K";
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

        if (isUnderAttack(chessBoard, toLine, toColumn)) {
            return false;
        }

        // проверка правильности хода короля
        return Math.abs(line - toLine) <= 1 && Math.abs(column - toColumn) <= 1;
    }

    public static boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null && !board.board[i][j].color.equals(board.nowPlayer) && !(board.board[i][j] instanceof King)) {
                    if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
