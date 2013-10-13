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

        ArrayList<Block> blocks = new ArrayList<Block>();


        return blocks;
    }

    private void createWorld() {
        level = new Level();
        player = new Player(new Vector2f(0, 0));
    }
}
