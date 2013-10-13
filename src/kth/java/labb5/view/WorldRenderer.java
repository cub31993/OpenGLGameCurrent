package kth.java.labb5.view;

import kth.java.labb5.model.World;

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

    }

    public void renderBlocks() {

    }
}
