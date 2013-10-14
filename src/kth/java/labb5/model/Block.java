package kth.java.labb5.model;

import org.lwjgl.util.Rectangle;
import org.lwjgl.util.vector.Vector2f;

public class Block {

    Vector2f position = new Vector2f();
    Rectangle bounds;

    public Block(int x, int y) {
        this.position = new Vector2f(x, y);
        this.bounds = new Rectangle(x, y, 32, 32);
    }

    public Vector2f getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return bounds;
    }
}
