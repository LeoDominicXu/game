package fir.evt;

import fir.vo.Point;


public class GoEvent implements Event {

    public Point point;
    public byte color;

    public GoEvent(Point point, byte color) {
        this.point = point;
        this.color = color;
    }
}
