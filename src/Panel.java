import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Planet earth;
    Planet venus;
    public Panel(){

        earth = new Planet();
        earth.c = Color.blue;  // установка цвета планеты
        earth.dist = 149598261;
        earth.radius = 6371;
        earth.days = 365.256363004;

        venus = new Planet();
        venus.c = Color.orange;  // установка цвета планеты
        venus.dist = 108208930;
        venus.radius = 6051;
        venus.days = 243.023;

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(200,200,200,200);
        earth.draw(g); // g -  холст и кисти
        venus.draw(g); // g -  холст и кисти
    }
}
