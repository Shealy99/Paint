/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics2D;

/**
 *
 * @author Acer
 */
public class Tools {

    public static void drawRectangle(Graphics2D g, int x, int y, int width, int height) {
        g.drawLine(x, y, x + width, y);
        g.drawLine(x, y, x, y + height);
        g.drawLine(x + width, y, x + width, y + height);
        g.drawLine(x, y + height, x + width, y + height);

    }

    public static void pen(Graphics2D g, int x, int y, int radius) {
        g.fillOval(x, y, radius, radius);
    }

    public static void fillRectangle(Graphics2D g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    public static void kova(Graphics2D g, int x, int y) {
    }

    public static void clearRect(Graphics2D g, int x, int y, int width, int height) {
        g.setColor(g.getBackground());
        g.drawLine(x, y, x + width, y);
        g.drawLine(x, y, x, y + height);
        g.drawLine(x + width, y, x + width, y + height);
        g.drawLine(x, y + height, x + width, y + height);
    }

}
