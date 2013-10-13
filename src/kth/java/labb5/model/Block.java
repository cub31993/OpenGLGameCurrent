package kth.java.labb5.model;

import org.lwjgl.util.Rectangle;
import org.lwjgl.util.vector.Vector2f;

public class Block {

    Vector2f position = new Vector2f();
    Rectangle bounds;

    public Block(Vector2f pos) {
        this.position = pos;
        bounds = new Rectangle((int)pos.x, (int)pos.y, 32, 32);
    }

    public Vector2f getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return bounds;
    }
}
