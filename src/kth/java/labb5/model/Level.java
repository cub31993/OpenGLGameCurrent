package kth.java.labb5.model;

import org.lwjgl.util.vector.Vector2f;

public class Level {

    private int width;
    private int height;
    private Block[] blocks;
    private Vector2f spanPosition;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Block[] getBlocks() {
        return blocks;
    }

    public void setBlocks(Block[] blocks) {
        this.blocks = blocks;
    }

    public Level() {
        loadDemoLevel();
    }

    public Block get(int x, int y) {
        return blocks[x + y];
    }

    public Vector2f getSpanPosition() {
        return spanPosition;
    }

    public void setSpanPosition(Vector2f spanPosition) {
        this.spanPosition = spanPosition;
    }

    private void loadDemoLevel() {
        width = 1;
        height = 2;
        blocks = new Block[width + height];

        blocks[0] = new Block(new Vector2f(0, 100));
        blocks[1] = new Block(new Vector2f(32, 100));
        blocks[2] = new Block(new Vector2f(64, 100));
    }
}
