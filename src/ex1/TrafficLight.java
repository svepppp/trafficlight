package ex1;

import java.util.Scanner;

import static ex1.Colour.GREEN;
import static ex1.Colour.RED;
import static ex1.Colour.YELLOW;

public class TrafficLight {
    private int SIZE = 3; //  размер светофора
    private Light[] lights = new Light[SIZE];  // лампочка
    private Colour[] colours = {GREEN, YELLOW, RED};  // цвет
    private Scanner scanner = new Scanner(System.in);

    public TrafficLight() {
    }

    public void init() {  //  инициализация
        for (int i = 0; i < SIZE; i++) {
            System.out.println(colours[i] + ":   укажите длительность в минутах  ");
            int time = getTime();
            lights[i] = new Light(colours[i], time);

        }
    }

    public void shine() {  // включить светофор
        for (Light light : lights) {
            light.shine();
        }
    }

    public int getTime() {  // получить длительность  светового сигнала
        int time = 0;
        if (scanner.hasNextInt()) {
            time = scanner.nextInt();
        } else {
            scanner.nextLine();
        }
        return time;
    }
}
