import java.awt.*;
import java.awt.event.InputEvent;

class Main implements Runnable {
    Robot robot;

    public static void main(String[] args) {
        new Main().ini();
    }

    public void ini() {
        try {
            robot = new Robot();
        } catch (Exception e) {
        }
        new Thread(this).start();
    }

    public void run() {
        int a = 0;
        while (a <= 50 * 9999) {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            a++;
        }
        System.exit(0);
    }
}