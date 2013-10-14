package kth.java.labb5.view;

import kth.java.labb5.model.Block;
import kth.java.labb5.model.World;

import static org.lwjgl.opengl.GL11.*;

/*
view class
render everything in world
 */
public class WorldRenderer {

    public World world;

    public WorldRenderer(World world) {
        this.world = world;
    }

    public void render() {
        renderBlocks();
        renderPlayer();
    }

    public void renderPlayer() {
      //get player from world and render
    }

    public void renderBlocks() {
        for(Block b: world.getDrawableBlocks(0, 0)) {

            glColor3f(1f,1f,1f);
            glBegin(GL_QUADS);
                glVertex2f(b.x, b.y);
                glVertex2f(b.x + 64, b.y);
                glVertex2f(b.x + 64, b.y + 64);
                glVertex2f(b.x, b.y + 64);
            glEnd();
        }
    }
}
