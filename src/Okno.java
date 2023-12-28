import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {
    static Panel p;
    public Okno(){
        p = new Panel();
        setContentPane(p);
        setBounds(300,50,600+8+8,600+30+8);
        setTitle("Модель солнечной системы");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
