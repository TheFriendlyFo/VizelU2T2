import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        float rect1Length = myScanner.nextFloat ();
        System.out.print("Enter rectangle 1 width: ");
        float rect1Width = myScanner.nextFloat ();
        System.out.print("Enter rectangle 1 height: ");
        float rect1Height = myScanner.nextFloat();
        System.out.print("Enter rectangle 2 length: ");
        float rect2Length = myScanner.nextFloat ();
        System.out.print("Enter rectangle 2 width: ");
        float rect2Width = myScanner.nextFloat ();
        System.out.print("Enter rectangle 2 height: ");
        float rect2Height = myScanner.nextFloat();

        // write the rest of your program below
        Rectangle rect1 = new Rectangle(rect1Length, rect1Width, rect1Height);
        Rectangle rect2 = new Rectangle(rect2Length, rect2Width, rect2Height);
        
        System.out.println("\nRectangle One:");
        rect1.printData();
        System.out.println("\nRectangle Two:");
        rect2.printData();
    }
}
