import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 380;
    public static final int DIAMETER = 10;
    private  int firstBallXCoordinate=0;
    private  int secondBallXCoordinate=0;
    private  int thirdBallXCoordinate=0;
    private  int fourthBallXCoordinate=0;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        int speed = 1;

        drawCircle(firstBallXCoordinate,HEIGHT/5);
        firstBallXCoordinate+= speed;

        drawCircle(secondBallXCoordinate,2*HEIGHT/5);
        secondBallXCoordinate+= speed *2;

        drawCircle(thirdBallXCoordinate,3*HEIGHT/5);
        thirdBallXCoordinate+= speed *3;

        drawCircle(fourthBallXCoordinate,4*HEIGHT/5);
        fourthBallXCoordinate+= speed *4;

    }

    private void drawCircle(int xCoordinate, int yCoordinate) {

        ellipse(xCoordinate,yCoordinate, DIAMETER,DIAMETER);
    }
}

