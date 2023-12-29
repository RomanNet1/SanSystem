import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Planet earth; // планета Земля
    Planet venus;// планета Венера
    Planet mercure;// планета Меркурий
    static Planet base; // базовая планета, от которой всё рисуется


    /*
------------------------------------------------------------------------------------//
------     Создание планет на панели    --------------------------------------------//
------------------------------------------------------------------------------------//
*/


    public Panel(){

        earth = new Planet( Color.blue,149598261,6371, 365.256363004);

        venus = new Planet( Color.orange,  108208930, 6051, 243.023);

        mercure = new Planet( Color.red,  57909227, 2439, 87.969);

        base = earth;

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(200,200,200,200);
        earth.draw(g); // g -  холст и кисти
        venus.draw(g); // g -  холст и кисти
        mercure.draw(g);
    }
}

//Было

//        earth.c = Color.blue;  // установка цвета планеты
//        earth.dist = 149598261;
//        earth.radius = 6371;
//        earth.days = 365.256363004;