import java.awt.*;
import java.io.IOException;

public class Lions extends GPS_Location implements Trackable{
    int radius = 3;
    String age;

    public Lions(String name, int GPSid,int age ) throws IOException {
        super(name, GPSid);
        this.age = String.valueOf(age);

    }

    public void draw(Graphics g) {
            g.setColor(Color.red);
            g.drawString(name+ " "+ age, location.x , location.y+1);
            g.fillOval(location.x - radius, location.y - radius, 2 * radius, 2 * radius);
    }

}
