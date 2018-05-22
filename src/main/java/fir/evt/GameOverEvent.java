package fir.evt;

import fir.ChessBoard;


public class GameOverEvent implements Event {

    public Result result;

    public GameOverEvent(Result result) {
        this.result = result;
    }

    public enum Result {
        draw, whiteWin, blackWin, nobodyWin;

        public static Result fromColor(int color) {
            return color == ChessBoard.BLACK ? blackWin : (color == ChessBoard.WHITE ? whiteWin : nobodyWin);
        }
    }
}
