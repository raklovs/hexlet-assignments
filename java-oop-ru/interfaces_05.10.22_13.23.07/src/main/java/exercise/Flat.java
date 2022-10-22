package exercise;

// BEGIN
public class Flat implements Home {

    double area;        //жилая площадь квартиры
    double balconyArea; //площадь балкона
    int floor;          //этаж, на котором расположена квартира

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;  //Общая площадь квартиры складывается из жилой площади и площади балкона.
    }

    @Override
    public int compareTo(Home another) {//либо так короче - Double.compare(getArea(), another.getArea());
        if (getArea() > another.getArea()) {
            return 1;
        } else if (getArea() < another.getArea()) {
            return -1;
        } else return 0;
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
