public class Circle {
    // instance variables
    final double radius;
    final double area;
    final double circ;

    // constructor
    public Circle(double rad) {
        radius = rad;
        area = Math.PI * radius * radius;
        circ = Math.PI * radius * 2;
    }

    // method to print area
    public void printData() {
        System.out.println("My area is: " +  area);
        System.out.println("My circumference is: " +  circ);
    }

    // Given two circles, calculates a new circle with an area equal to the sum of both input circles:
    public Circle merge(Circle mergeCircle) {
        double newArea = area + mergeCircle.area;
        double newRad = Math.sqrt(newArea / Math.PI);

        return new Circle(newRad);
    }
}
