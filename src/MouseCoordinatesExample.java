import java.awt.MouseInfo;
import java.awt.Point;

public class MouseCoordinatesExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(10000); // Задержка в 5 секунд
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
        int x = (int) mouseLocation.getX();
        int y = (int) mouseLocation.getY();
        System.out.println("Текущие координаты мыши: x = " + x + ", y = " + y);

    }
}