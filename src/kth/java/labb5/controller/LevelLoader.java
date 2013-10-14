package kth.java.labb5.controller;

import kth.java.labb5.model.Block;
import kth.java.labb5.model.Level;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LevelLoader {

    public static Level loadLevel(int number) {

        Level level = new Level();

        try {
            BufferedImage image = ImageIO.read(new File("assets/levels/level-" + number + ".png"));
            int w = image.getWidth();
            int h = image.getHeight();

            level.setDimensions(w, h);
            image.getRGB(0, 0, w, h, level.getBlocks(), 0, w);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception! Could not load level file!");
        }

        return level;
    }
}