public class Point {
    final float x;
    final float y;

    Point(float inx, float iny) {
        x = inx;
        y = iny;
    }

    // Very unnecessarily calculates the angle of the point to determine its quadrant:
    private double getAngle() {
        double dist = Math.sqrt(x*x + y*y); // Distance from the origin
        double angle = Math.acos(x / dist); // Angle relative to origin, found with distance.
        if (y<0) {
            angle = Math.PI*2 - angle;
        }

        return angle;
    }

//    Uses the angle of the point to return the quadrant as -1, 0, 1, 2, 3, or 4:
    private String getQuad() {
        String[] quads = new String[]{"on the origin", "in quadrant I", "in quadrant II", "in quadrant III", "in quadrant IV", "on an axis"};
        int quad;

        if ((y == 0) ^ (x == 0)) { // If the point has one value equal to zero, but not both
            quad = 5;
        } else if (y == 0) { // If the point has both values equal to zero
            quad = 0;
        } else { // If the point has no values equal to zero:
            quad = (int) (2 * getAngle() / Math.PI) + 1;
        }

        return quads[quad];
    }

    public void printData() {
        System.out.printf("Point is at (%s, %s).\n", x, y);
        System.out.printf("Point is %s.\n", getQuad());
    }
}
