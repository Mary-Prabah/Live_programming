import java.io.IOException;
import java.util.*;
import java.awt.*;

public class Drawing extends Canvas {
    ArrayList<GPS_Location> coord;

    public Drawing(ArrayList<GPS_Location> coord) throws IOException {
        this.coord = coord;

    }

    public void paint(Graphics g) {
        for (GPS_Location GPS : coord) {
            GPS.draw(g);
        }
    }
//    public void repaint(Graphics g) {
//        for (GPS_Location GPS : coord) {
//            GPS.draw(g);
//        }
//    }
}


