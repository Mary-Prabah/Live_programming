import java.awt.*;
import java.io.IOException;

public class Keeper extends GPS_Location{
    int radius = 2;
    String PhoneNumber;
    public Keeper(String name, int GPSid, int PhoneNumber) throws IOException {
        super(name, GPSid);
        this.PhoneNumber = String.valueOf(PhoneNumber);

    }
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.drawString(name + "   "  + PhoneNumber, location.x , location.y+1);
        g.fillOval(location.x - radius, location.y - radius, 2 * radius, 2 * radius);
    }

}
