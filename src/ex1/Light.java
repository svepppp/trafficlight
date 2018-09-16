package ex1;

public class Light {
    private Colour colour;
    private int time;

    public Light() {
    }

    public Light(Colour colour, int time) {
        this.colour = colour;
        this.time = time;
    }

    public void shine() {
        int MINUTE = 60000;  //  одна минута
        System.out.println(colour);
        try {
            Thread.sleep(time * MINUTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



