package kth.java.labb5.model;

import org.lwjgl.util.Rectangle;
import org.lwjgl.util.vector.Vector2f;

/*
model class
player, standard fields etc
 */
public class Player {

    public static final int SIZE = 64;

    private static final float MAX_VEL = 1f;

    private Vector2f position;
    private Vector2f velocity;
    private Rectangle bounds;

    public Player(Vector2f position) {
        this.position = position;
        this.bounds = new Rectangle((int)position.x, (int)position.y, SIZE, SIZE);
        this.velocity = new Vector2f(0, 0);
    }

    public Vector2f getPosition() {
        return position;
    }

    public Vector2f getVelocity() {
        return velocity;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setPosition(Vector2f position) {
        this.position = position;
        this.bounds.setX((int)position.x);
        this.bounds.setY((int)position.y);
    }

    public void setVelocity(Vector2f velocity) {
        this.velocity = velocity;
    }

    public void update() {

        //move player here
    }
}
