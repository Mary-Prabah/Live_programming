import java.awt.*;
import java.io.IOException;

public class GPS_Location implements Trackable {
    protected String name;
    protected Point location;

    public GPS_Location (String name, int GPSid) throws IOException {
        this.name = name;
        this.location= LocationSystem.getCoords(GPSid);
    }

    public String getName () {
    return name;
    }


    @Override
    public void draw(Graphics g) {

    }
}


