package fir.evt;

import fir.vo.Point;


public class TurnToRobotEvent extends AbstractSituationEvent {

    public TurnToRobotEvent(byte[][] matrix, Point point, int step) {
        super(matrix, point, step);
    }
}
