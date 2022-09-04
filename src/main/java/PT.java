import processing.core.PApplet;

public class PT extends PApplet {
    public static final int HEIGHT = 640;
    public static final int WIDTH = 480;
    public static final int DIAMETER = 100/2;
    //public static final int DIAMETER = 100;
    int x1,x2,x3,x4;
    public static void main(String[] args) {
    PApplet.main("PT",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }


    @Override
    public void setup() {
      //  ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {

        drawCirle();
        drawCirle1();
        drawCirle2();
        drawCirle3();

    }

    private void drawCirle1() {
        ellipse(x1,WIDTH/5, DIAMETER, DIAMETER);
        x1++;
    }
    private void drawCirle2() {
        ellipse(x2,WIDTH*2/5, DIAMETER, DIAMETER);
        x2=x2+2;
    }
    private void drawCirle3() {
        ellipse(x3,WIDTH*3/5, DIAMETER, DIAMETER);
        x3=x3+3;
    }
    private void drawCirle() {
        ellipse(x4,WIDTH*4/5, DIAMETER, DIAMETER);
        x4=x4+4;
    }

}
