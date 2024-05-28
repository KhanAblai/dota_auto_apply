import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;

public class FullScreenCaptureExample {
    public static void main(String[] args) throws AWTException {
        boolean enabled = true;
        Robot robot = new Robot();
        while (enabled) {
            int x = 831;
            int y = 512;

            BufferedImage image = robot.createScreenCapture(new Rectangle(x, y, 1, 1));
            try {
                Thread.sleep(200); // Задержка в 5 секунд
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            int pixelColor = image.getRGB(0, 0);

            // Извлекаем компоненты цвета (красный, зеленый, синий)
            int red = (pixelColor >> 16) & 0xFF;
            int green = (pixelColor >> 8) & 0xFF;
            int blue = pixelColor & 0xFF;
            if ((red==49) && (green==81) && (blue==68)) {
                robot.mouseMove(x, y);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                enabled = false;
            } else {
                System.out.println();
            }
        }
    }
}