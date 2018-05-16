package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class DrawingComponent extends JPanel {
    int xg[] = new int[300];
    int yg[] = new int[300];
    int ng;

    int xg1[] = new int[300];
    int yg1[] = new int[300];
    int ng1;

    int xg2[] = new int[300];
    int yg2[] = new int[300];
    int ng2;

    @Override
    protected void paintComponent(Graphics gh) {
        Image image = null;
        Image image2 = null;
        Image image3 = null;
        try {
            image = ImageIO.read(new File("image1.png"));
            image2 = ImageIO.read(new File("image2.png"));
            image3 = ImageIO.read(new File("image3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics2D drp = (Graphics2D)gh;
        drp.drawPolyline(xg, yg, ng);
        drp.drawPolyline(xg1, yg1, ng1);
        drp.drawPolyline(xg2, yg2, ng2);
        gh.drawImage(image, 50, 50, null);
        gh.drawImage(image2, 400, 50, null);
        gh.drawImage(image3, 750, 50, null);
    }
}