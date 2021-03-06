package kth.java.labb5.model;

import kth.java.labb5.controller.LevelLoader;
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
        return level.getObjects();
    }

    private void createWorld() {
        level = new LevelLoader().loadLevel(2);
        level.initObjects();
        System.out.println(level.toString());
        player = new Player(new Vector2f(0, 0));
    }
}
