public abstract class ChessPiece  {
    static final String WHITE = "white";
    static final String BLACK = "black";

    protected String  symbol;
    protected String  color;
    private boolean isMove;

    public String getSymbol() {
        return this.symbol;
    }

    public String getColor() {
        return this.color;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public void setIsMove(boolean move) {
        this.isMove = move;
    }
}
