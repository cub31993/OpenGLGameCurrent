package kth.java.labb5.model;

import org.lwjgl.util.vector.Vector2f;

import java.util.ArrayList;

public class Level {

    private int width;
    private int height;
    private int[] blocks;
    private ArrayList<Block> objects;
    private Vector2f spanPosition;

    public Level() {
        objects = new ArrayList<Block>();
    }

    public int getWidth() {
        return width;
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
        this.blocks = null;
        this.blocks = new int[width * height];
    }

    public int getHeight() {
        return height;
    }

    public int[] getBlocks() {
        return blocks;
    }

    public ArrayList<Block> getObjects() {
        return objects;
    }

    public Vector2f getSpanPosition() {
        return spanPosition;
    }

    public void setSpanPosition(Vector2f spanPosition) {
        this.spanPosition = spanPosition;
    }

    public void initObjects() {
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if(blocks[x + y * width] != -1) {
                    objects.add(new Block(x, y));
                }
            }
        }
    }

    public String toString() {
        String t = "";
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                t += "tile " + x + ":" + y + " - " + blocks[x + y * width] + "\n";
            }
        }
        return t;
    }
}
