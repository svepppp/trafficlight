package ex1;

import java.util.Scanner;

import static ex1.Color.GREEN;
import static ex1.Color.RED;
import static ex1.Color.YELLOW;

public class TrafficLight {
    private static final int SIZE = 3; //  size of traffic light
    private Light[] lights = new Light[SIZE];  // light
    private Color[] colors = {GREEN, YELLOW, RED};  // color
    private Scanner scanner = new Scanner(System.in);

    public TrafficLight() {
    }

    // initialization
    public void init() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println(colors[i] + ":   укажите длительность в минутах  ");
            int time = getTime();
            lights[i] = new Light(colors[i], time);
        }
    }

    // turn on the traffic light
    public void toShine() {
        for (Light light : lights) {
            light.toShine();
        }
    }

    //get the duration of the light signal
    public int getTime() {
        int time = 0;
        if (scanner.hasNextInt()) {
            time = scanner.nextInt();
        } else {
            scanner.nextLine();
        }
        return time;
    }
}
