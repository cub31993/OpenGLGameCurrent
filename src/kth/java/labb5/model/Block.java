package kth.java.labb5.model;

import org.lwjgl.util.Rectangle;
import org.lwjgl.util.vector.Vector2f;

public class Block {

    public int x;
    public int y;
    Rectangle bounds;

    public Block(int x, int y) {
        this.x = x << 6;
        this.y = y << 6;
        this.bounds = new Rectangle(this.x, this.y, 64, 64);
    }

    public Rectangle getBounds() {
        return bounds;
    }
}
