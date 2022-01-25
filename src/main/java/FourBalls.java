import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 380;
    public static final int DIAMETER = 10;
    private final int[] ballsXCoordinate=new int[4];
    private final int[] ballsYCoordinate=new int[4];


    public FourBalls() {
        initializeHeights();
    }

    private void initializeHeights() {
        for (int iterator = 0; iterator <ballsYCoordinate.length ; iterator++)
            ballsYCoordinate[iterator]=(iterator+1)*HEIGHT/5;
    }

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

        drawBalls();
        increaseSpeed();
    }

    private void increaseSpeed() {
        for (int iterator = 0; iterator < 4; iterator++) {
            setXCoordinate(iterator);
        }

    }

    private void drawBalls() {
        for (int iterator = 0; iterator < 4; iterator++) {
            createCircle(ballsXCoordinate[iterator],ballsYCoordinate[iterator]);
        }
    }

    private void createCircle(int xCoordinate, int yCoordinate) {

        ellipse(xCoordinate,yCoordinate, DIAMETER,DIAMETER);
    }

    private void setXCoordinate(int ballNUmber){

        int speed=1;
        ballsXCoordinate[ballNUmber]+=speed*(ballNUmber+1);

    }
}

