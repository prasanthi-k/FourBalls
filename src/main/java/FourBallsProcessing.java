import processing.core.PApplet;

public class FourBallsProcessing  extends  PApplet{

    public static int width = 640;
    public static final int height = 640;
    public static final int radius = 50;

    int height1 = (height/5);
    int height2 = (height * 2/5);
    int height3 = (height * 3/5);
    int height4 = (height * 4/5);


    int speed1 = 1;
    int speed2 = 2;
    int speed3 = 3;
    int speed4 = 4;


    int width1=0;
    int width2=0;
    int width3=0;
    int width4=0;

    public static void main(String[] args) {PApplet.main("FourBallsProcessing", args);}

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {
        drawCircle(speed1,height1,width1);
    }

    private void drawCircle(int speed1, int height1, int width) {
        new Ball(height1, width,radius,speed1,this).draw();
        new Ball(height2, (width*speed2),radius,speed1,this).draw();
        new Ball(height3, (width*speed3),radius,speed1,this).draw();
        new Ball(height4, (width*speed4),radius,speed1,this).draw();
        this.width1+=1;
    }


}
