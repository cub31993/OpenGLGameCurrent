package kth.java.labb5.controller;

import kth.java.labb5.model.Player;
import kth.java.labb5.model.World;

/*
controller class
taking input from user and updates model (player)
 */
public class PlayerController {

    private World world;
    private Player player;

    public PlayerController(World world) {
        this.world = world;
        this.player = world.getPlayer();
    }

    public void update() {
        processInput();
        //move player
        player.update();
    }

    private void processInput() {
    }
}
