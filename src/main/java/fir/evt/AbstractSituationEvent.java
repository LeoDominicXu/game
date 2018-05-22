package fir.evt;

import fir.vo.Point;


public abstract class AbstractSituationEvent implements Event {

    public byte[][] matrix;
    public Point point;
    public int step;

    public AbstractSituationEvent(byte[][] matrix, Point point, int step) {
        this.matrix = matrix;
        this.point = point;
        this.step = step;
    }
}
