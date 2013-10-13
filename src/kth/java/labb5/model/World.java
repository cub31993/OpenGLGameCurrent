package kth.java.labb5.model;

import org.lwjgl.util.Rectangle;
import org.lwjgl.util.vector.Vector2f;

import java.util.ArrayList;

public class World {

    public Player player;
    public Level level;

    public World() {
        createWorld();
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Block> getDrawableBlocks(int width, int height) {
        int x = (int)player.getPosition().x - width;
        int y = (int)player.getPosition().y - height;
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }

        ArrayList<Block> blocks = new ArrayList<Block>();
        Block block;

        for(int i = 0; i < 3; i++) {

            block = level.getBlocks()[i];
            blocks.add(block);
        }

        return blocks;
    }

    private void createWorld() {
        level = new Level();
        player = new Player(new Vector2f(0, 0));
    }
}
