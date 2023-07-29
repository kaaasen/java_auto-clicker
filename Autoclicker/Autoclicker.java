import java.awt.*;
import java.awt.event.InputEvent;

public class Autoclicker {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Delay between clicks in milliseconds
        int delay = 1;

        // Number of clicks to perform
        int numClicks = 10000;

        // Create an instance of the Robot class
        Robot robot = new Robot();

        // Perform the clicks
        for (int i = 0; i < numClicks; i++) {
            // Simulate a mouse button press and release
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // Delay between clicks
            Thread.sleep(delay);
        }
    }
}
