package exercise;

// BEGIN
public class Segment {
    private final Point point1;
    private final Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Point getBeginPoint() {
        return point1;
    }
    public Point getEndPoint() {
        return point2;
    }

    public Point getMidPoint() {
        int midPointX = (getBeginPoint().getX()) + (getEndPoint().getX());
        if (midPointX > 0) {
            midPointX -= 1;
        } else {
            midPointX += 1;
        }
        int midPointY = (getBeginPoint().getY()) + (getEndPoint().getY());
        if (midPointY > 0) {
            midPointY -= 1;
        } else {
            midPointY += 1;
        }
        return new Point(midPointX, midPointY);
    }
}
// END
