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

    private int dist; // растояние до солнца в км
    private int radius; // размер панеты в км
    private double days; // Год планеты в земных днях


//------------------------------------------------//
//------     Конструктор создания планет  --------//
//------------------------------------------------//

    public Planet(Color c, int d, int r, double days) {
        this.c = c;
        this.dist = d;
        this.radius = r;
        this.days = days;


        Timer t; //выполнить один раз
        t = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double speed = Panel.base.days / days  * 2;
                ALPHA+=speed;
                Okno.p.repaint(); //переменная p глобальная
            }
        });
        t.start();
    }


//--------------------------------------------------------//
//------     Рисование планет и эклиптики          -------//
//--------------------------------------------------------//

    public void draw(Graphics g) {

        // 1 - Рисование эклиптики

        g.setColor(c);
        double z = Panel.base.dist;
        R = (int) (dist / z * 300);
        int xx = (300 - R);
        g.drawOval(xx, xx, R * 2, R * 2);


        // 2 - Рисование планеты

        z = Panel.base.radius;
        W = (int) (radius / z * 60);
        int x = (int) (X0 + R * Math.cos(Math.toRadians(ALPHA) ));
        int y = (int) (Y0 + R * Math.sin(Math.toRadians(ALPHA)));
        g.fillOval(x - W / 2, y - W / 2, W, W);


    }
}
