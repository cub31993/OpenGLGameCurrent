package kth.java.labb5;

import kth.java.labb5.screens.GameScreen;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class Window {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = WIDTH / 16 * 9;
    public static final int FPS_CAP = 60;

    private GameScreen gameScreen;

    public Window() {

        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, 800, 0, 600, 1, -1);
        glMatrixMode(GL_MODELVIEW);

        gameScreen = new GameScreen();
    }

    public void run() {

        while (!Display.isCloseRequested()) {

            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            gameScreen.update();

            Display.sync(FPS_CAP);
            Display.update();
        }

        Display.destroy();
    }
}
