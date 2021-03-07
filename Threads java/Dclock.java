import java.lang.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

class Demo extends Threads {
    void digital() {
        JFrame j1 = new JFrame("DIGITAL CLOCK");
        j1.setSize(400, 400);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    Thread T;

    public void start() {
        T = new Thread();
        T.start();
    }

    public void run() {
        Thread t1 = Thread.currentThread();
        while (T == t1) {
            repaint();
            try {
                t1.sleep(1000);

            } catch (Exception e) {

            }

        }

    }

    public void paint(Graphics g) {
        Calender cal = new GregorianCalendar();
        String hour = String.valueOf(cal.get(Calender.HOUR));
        String Minut = String.valueOf(cal.get(Calender.MINUT));
        String secound = String.valueOf(cal.get(Calender.SECOUND));
        g.drawString(hour + ":" + Minut + ":" + secound, 20, 30);
    }

}

public class Dclock {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.digital();
    }

}
