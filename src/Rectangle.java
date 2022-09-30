// Rectangle class definition
public class Rectangle {

    // instance variables
    final float length;
    final float width;
    final float height;
    final float area;
    final float volume;


    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(float len, float wid, float ht) {
        length = len;
        width = wid;
        height = ht;
        area = len * wid;
        volume = area * ht;
    }

    // method that calculates and prints area
    public void printData() {
        System.out.println("Area:" + area);
        System.out.println("Box Volume: " + volume);
    }
}

