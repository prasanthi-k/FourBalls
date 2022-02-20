import processing.core.PApplet;

public class Ball {
    public int height;
    public int width;
    public int radius;
    public int speed;
    public PApplet pApplet;

    public Ball(int height, int width, int radius, int speed, PApplet pApplet)
    {
        this.height=height;
        this.width = width;
        this.radius = radius;
        this.speed = speed;
        this.pApplet = pApplet;
    }

    public void draw() {
        pApplet.ellipse(width,height,radius,radius);
    }

}
