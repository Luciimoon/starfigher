

import java.awt.*;
import javax.swing.*;


public class Bullet extends GalagaObject
{
    Color col;
    public int y;
    public int x;
    Bullet()
    {
        width = 10;
        height = 10;

        x = 0;
        y = 0;

        attribute = "bullet";
        col = Color.RED;
    }

    public void update()
    {
        y -= 10;
    }

    public void makeColor()
    {
        col = Color.GREEN;
    }
    public void draw(Graphics g, Component c)
    {
        g.setColor(col);
        g.fillOval(x, y, width, height);
    }
}