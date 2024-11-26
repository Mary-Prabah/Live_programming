import java.awt.*;
import java.io.IOException;

public class Drones extends GPS_Location implements Trackable {

    int length = 3;
    String frequency;

    public Drones(String name, int GPSid, int frequency) throws IOException {
        super(name, GPSid);
        this.frequency = String.valueOf(frequency);
    }

    public void draw(Graphics g) {
            g.setColor(Color.black);
            g.drawString( name+ "  " + frequency, location.x+ length/2 , location.y +length+1);
            g.fillRect (location.x - length/2, location.y+length/2, length, length);
        }


}
