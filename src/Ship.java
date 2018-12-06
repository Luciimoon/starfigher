
public class Ship extends GalagaObject
{

    //ship velocity
    int dx;

    Ship()
    {
        attribute = "ship";
    }
    public void update()
    {
        x+=dx;
    }

}