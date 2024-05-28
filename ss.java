import java.awt.MouseInfo;
import java.awt.Point;

public class MouseCoordinatesExample {
    public static void main(String[] args) {
        Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
        int x = (int) mouseLocation.getX();
        int y = (int) mouseLocation.getY();
        System.out.println("Текущие координаты мыши: x = " + x + ", y = " + y);
    }
}