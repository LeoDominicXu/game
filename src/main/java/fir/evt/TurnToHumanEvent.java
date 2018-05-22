package fir.evt;

import fir.vo.Point;


public class TurnToHumanEvent extends AbstractSituationEvent {

    public TurnToHumanEvent(byte[][] matrix, Point point, int step) {
        super(matrix, point, step);
    }
}
