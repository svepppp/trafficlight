package ex1;

public class Light {
    private static final int MINUTE = 60000; //  one minute
    private Color color;
    private int time;

    public Light() {
    }

    public Light(Color color, int time) {
        this.color = color;
        this.time = time;
    }

    public void toShine() {
        System.out.println(color);
        try {
            Thread.sleep(time * MINUTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



