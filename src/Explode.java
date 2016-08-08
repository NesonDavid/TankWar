import java.awt.*;

/**
 * Created by user on 2016/8/8.
 */
public class Explode {
    int x,y;
    private boolean live = true;

    private TankClient tc;

    public Explode(int x, int y, TankClient tc) {
        this.x = x;
        this.y = y;
        this.tc = tc;
    }

    int[] diameter = {4, 8, 14, 24, 36, 49, 30, 14, 4};
    int step = 0;

    public void draw(Graphics g) {
        if(!live) {
            tc.explodes.remove(this);
            return;}

        if(step == diameter.length) {
            live = false;
            step = 0;
        }

        Color c = g.getColor();
        g.setColor(Color.orange);
        g.fillOval(x, y, diameter[step], diameter[step]);
        g.setColor(c);

        step ++;
    }
}
