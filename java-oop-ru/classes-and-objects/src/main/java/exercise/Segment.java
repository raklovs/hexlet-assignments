package exercise;

// BEGIN
public class Segment {

    private final Point point1;
    private final Point point2;

    int midPointX;
    int midPointY;

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
        midPointX = (getBeginPoint().getX()) + (getEndPoint().getX());
        if (midPointX > 0) {
            midPointX -= 1;
        } else {
            midPointX += 1;
        }
        midPointY = (getBeginPoint().getY()) + (getEndPoint().getY());
        if (midPointY > 0) {
            midPointY -= 1;
        } else {
            midPointY += 1;
        }
        return new Point(midPointX, midPointY);
    }

    public static void main(String[] args) {
        Point point1 = new Point(4, 3);
        Point point2 = new Point(1, 1);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        System.out.println(midPoint.getX()); // 4
        System.out.println(midPoint.getY()); //  3
    }
}
// END
