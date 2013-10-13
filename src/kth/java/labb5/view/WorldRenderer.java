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
      //get player from world and render
    }

    public void renderBlocks() {
        //get all blocks in camera and render
    }
}
