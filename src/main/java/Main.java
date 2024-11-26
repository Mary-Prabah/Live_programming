import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Frame frame = new Frame();
        ArrayList<GPS_Location> ToPlot= new ArrayList<GPS_Location>();
        Lions Simba = new Lions ("Simba", 30, 7);
        Drones Monitor1 = new Drones ("Monitor1", 124, 128);
        Keeper Geoff = new Keeper ("Geoff", 80,4392);
        ToPlot.add((GPS_Location) Simba);
        ToPlot.add((GPS_Location) Monitor1);
        ToPlot.add((GPS_Location) Geoff);
        Drawing drawing = new Drawing(ToPlot);

//        Lions Simba = new Lions("Simba", 80, Color.blue);
        frame.add(drawing);

        //Calling methods of the drawing object
        drawing.setSize(600, 600);
        drawing.setBackground(Color.white);



        //Calling methods of the frame object
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


    }
}


