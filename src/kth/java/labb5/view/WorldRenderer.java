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
            System.out.println("Rendering block" + b.getPosition().x);

            glColor3f(0.2f,0.2f,1.0f);
            glBegin(GL_QUADS);
            glVertex2f(b.getPosition().x, b.getPosition().y);
            glVertex2f(b.getPosition().x + 32, b.getPosition().y);
            glVertex2f(b.getPosition().x + 32, b.getPosition().y + 32);
            glVertex2f(b.getPosition().x, b.getPosition().y + 32);
            glEnd();
        }
    }
}
