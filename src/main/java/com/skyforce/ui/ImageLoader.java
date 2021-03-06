package com.skyforce.ui;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {
    public static BufferedImage image;
    public static BufferedImage entities;
    public static BufferedImage enemy, player, myPlane;

    public static void init() {
//        src\main\resources\airplane.png
       image = imageLoader("/whte.png");
       entities = imageLoader("/airplane.png");
       enemy = entities.getSubimage(0, 0,85, 90);
       player = entities.getSubimage(85, 0, 95, 90);
       myPlane = imageLoader("/airplane2.png").getSubimage(85, 0, 95, 90);
    }

    public static BufferedImage imageLoader(String path) {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
