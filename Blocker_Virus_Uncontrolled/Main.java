import javax.swing.*;
import java.awt.*;

class Main extends Canvas implements Runnable {
    Robot robot;
    JFrame f;

    public static void main(String[] args) {
        new Main().ini();
    }

    public void ini() {
        f = new JFrame();
        f.setUndecorated(true);
        f.add(this);
        f.setLocation(0, 0);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
        repaint();
        try {
            robot = new Robot();
        } catch (Exception e) {
        }
        new Thread(this).start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.black);
        g.setFont(new Font("Sans Serif", 20, 20));
        g.drawString("Give up. ", 100, 50);
        g.drawString("And Shut down your computer.", 100, 90);
    }

    public void run() {
        while (true) {
            robot.mouseMove(200, 100);
            robot.keyPress(27);
            robot.keyRelease(27);
            f.requestFocus();
        }
    }
}