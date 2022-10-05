package exercise;

// BEGIN
public class Segment {

    private final Point BeginPoint;
    private final Point EndPoint;

    public Segment(Point point1, Point point2) {
        this.BeginPoint = point1;
        this.EndPoint = point2;
    }

    public Point getBeginPoint() {
        return BeginPoint;
    }

    public Point getEndPoint() {
        return EndPoint;
    }

    public Point getMidPoint() {
        int midPointX = (getBeginPoint().getX() + getEndPoint().getX()) / 2;
        int midPointY = (getBeginPoint().getY() + getEndPoint().getY()) / 2;
        return new Point(midPointX, midPointY);
    }
}
// END
