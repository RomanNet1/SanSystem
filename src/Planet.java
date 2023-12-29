import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Planet { // класс планеты
    Color c; // цвет планеты // глобальная переменная
    int R = 300; // дистанция до солнца
    double ALPHA; // угол
    int W = 60;
    int X0 = 300;
    int Y0 = 300;

    int dist; // растояние до солнца в км
    int radius; // размер панеты в км
    double days; // Год планеты в земных днях

    public Planet() {
        //выполнить один раз
        Timer t;
        t = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double speed = 365.256363004 / days  * 2;

                ALPHA+=speed;
                //переменная p глобальная
                Okno.p.repaint();

            }
        });
        t.start();
    }

    public void draw(Graphics g) {

        // 1 - эклиптика

        g.setColor(c);
        double z = 149598261;
        R = (int) (dist / z * 300);
        int xx = (300 - R);
        g.drawOval(xx, xx, R * 2, R * 2);
        //System.out.println(R);

        // 2 - сама планета

        z = 6371;
        W = (int) (radius / z * 60);
        int x = (int) (X0 + R * Math.cos(Math.toRadians(ALPHA) ));
        int y = (int) (Y0 + R * Math.sin(Math.toRadians(ALPHA)));
        g.fillOval(x - W / 2, y - W / 2, W, W);


    }
}
