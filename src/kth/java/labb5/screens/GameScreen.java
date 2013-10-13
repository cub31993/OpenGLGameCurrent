package kth.java.labb5.screens;

import kth.java.labb5.controller.PlayerController;
import kth.java.labb5.model.World;
import kth.java.labb5.view.WorldRenderer;

public class GameScreen {

    private WorldRenderer renderer;
    private World world;
    private PlayerController controller;

    public GameScreen() {
        world = new World();
        renderer = new WorldRenderer(world);
        controller = new PlayerController(world);
    }

    //root tick
    public void update() {

        controller.update();
        renderer.render();
    }
}
