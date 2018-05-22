package fir.evt;

import fir.vo.Point;


public class AfterGoEvent extends AbstractSituationEvent {

    public AfterGoEvent(byte[][] matrix, Point point, int step) {
        super(matrix, point, step);
    }
}
