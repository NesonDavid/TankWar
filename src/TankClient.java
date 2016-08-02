import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2016/7/31.
 */
public class TankClient extends Frame{
    public static void main(String[] args) {
        new TankClient().launchFrame();
    }

    public void launchFrame() {
        setLocation(300,50);
        setSize(800,600);
        setTitle("TankWar");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setResizable(false);
        setVisible(true);
    }
}
