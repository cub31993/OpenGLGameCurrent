package se.kth.openglgame;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created with IntelliJ IDEA.
 * User: marek
 * Date: 2013-10-12
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class Game
{
    private boolean fullscreen;
    private int windowWidth;
    private int windowHeight;

    public Game(boolean fullscreen, int width, int height)
    {
        this.fullscreen = fullscreen;
        this.windowWidth = width;
        this.windowHeight = height;

        this.initalize();
    }

    public void initalize()
    {
         try
         {
             setDisplayMode();
             Display.setTitle(Constants.WINDOW_TITLE);
             Display.setFullscreen(this.fullscreen);
             Display.create();
         } catch (LWJGLException e) {
             e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
         }
    }

    private boolean setDisplayMode() throws LWJGLException
    {
        try
        {
            final DisplayMode[] displayMode = org.lwjgl.util.Display.getAvailableDisplayModes(windowWidth, windowHeight, -1, -1, -1, -1, 60, 60);
            org.lwjgl.util.Display.setDisplayMode(displayMode, new String[] {
                    "width=" + windowWidth,
                    "height=" + windowHeight,
                    "freq=60",
                    "bpp=" + org.lwjgl.opengl.Display.getDisplayMode().getBitsPerPixel()
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return false;
    }
}