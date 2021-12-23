import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.KeyPressedEvent;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class S502KeysAndColors extends GraphicsApp {

    private static final int CIRCLE_RADIUS = 30;
    private Circle[] circles;

    @Override
    public void initialize() {
        setCanvasSize(500, 500);
        circles = new Circle[3];
        circles[0] = new Circle(CIRCLE_RADIUS * 2, getHeight() / 2, CIRCLE_RADIUS, Colors.RED);
        circles[1] = new Circle(CIRCLE_RADIUS * 5, getHeight() / 2, CIRCLE_RADIUS, Colors.RED);
        circles[2] = new Circle(CIRCLE_RADIUS * 8, getHeight() / 2, CIRCLE_RADIUS, Colors.RED);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        for (Circle circle : circles) {
            circle.draw();
        }
    }

    @Override
    public void onKeyPressed(KeyPressedEvent event) {
        switch (event.getKeyCode()) {
            case KeyPressedEvent.VK_1:
                circles[0].setColor(Colors.getRandomColor());
                break;
            case KeyPressedEvent.VK_2:
                circles[1].setColor(Colors.getRandomColor());
                break;
            case KeyPressedEvent.VK_3:
                circles[2].setColor(Colors.getRandomColor());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("S502KeysAndColors");
    }
}
