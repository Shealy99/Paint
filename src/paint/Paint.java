/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Paint extends javax.swing.JFrame {

    private Color firstColor, secondColor;
    private boolean firstColorChecked = true;
    private boolean isShape = false;
    private int xStartShape, yStartShape, xFinishShape, yFinishShape;

    public Paint() {
        initComponents();
        firstColor = Color.BLACK;
        secondColor = Color.WHITE;
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paintPanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        black5 = new javax.swing.JLabel();
        griLehte = new javax.swing.JLabel();
        black18 = new javax.swing.JLabel();
        griRende = new javax.swing.JLabel();
        black14 = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        vishnje = new javax.swing.JLabel();
        pigment1 = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        white = new javax.swing.JLabel();
        color1 = new javax.swing.JLabel();
        black15 = new javax.swing.JLabel();
        outline = new javax.swing.JLabel();
        black4 = new javax.swing.JLabel();
        eraser1 = new javax.swing.JLabel();
        pen1 = new javax.swing.JLabel();
        black6 = new javax.swing.JLabel();
        brushes = new javax.swing.JLabel();
        black19 = new javax.swing.JLabel();
        orange = new javax.swing.JLabel();
        shapes = new javax.swing.JLabel();
        black17 = new javax.swing.JLabel();
        black11 = new javax.swing.JLabel();
        black7 = new javax.swing.JLabel();
        black13 = new javax.swing.JLabel();
        black16 = new javax.swing.JLabel();
        color2 = new javax.swing.JLabel();
        fill = new javax.swing.JLabel();
        black8 = new javax.swing.JLabel();
        black12 = new javax.swing.JLabel();
        editColors1 = new javax.swing.JLabel();
        kova1 = new javax.swing.JLabel();
        zoom1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        tools1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(686, 447));

        paintPanel1.setBackground(new java.awt.Color(255, 255, 255));
        paintPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paintPanel1MouseDragged(evt);
            }
        });
        paintPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paintPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paintPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                paintPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout paintPanel1Layout = new javax.swing.GroupLayout(paintPanel1);
        paintPanel1.setLayout(paintPanel1Layout);
        paintPanel1Layout.setHorizontalGroup(
            paintPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paintPanel1Layout.setVerticalGroup(
            paintPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        black5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        black5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                black5MouseClicked(evt);
            }
        });

        griLehte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        griLehte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                griLehteMouseClicked(evt);
            }
        });

        black18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        griRende.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        griRende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                griRendeMouseClicked(evt);
            }
        });

        black14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redMouseClicked(evt);
            }
        });

        vishnje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pigment1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        size.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sizeMouseClicked(evt);
            }
        });

        white.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        white.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteMouseClicked(evt);
            }
        });

        color1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        color1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color1MouseClicked(evt);
            }
        });

        black15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        outline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outlineMouseClicked(evt);
            }
        });

        black4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        black4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                black4MouseClicked(evt);
            }
        });

        eraser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eraser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraser1MouseClicked(evt);
            }
        });

        pen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pen1MouseClicked(evt);
            }
        });

        black6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        black6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                black6MouseClicked(evt);
            }
        });

        brushes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        black19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                black19MouseClicked(evt);
            }
        });

        orange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orangeMouseClicked(evt);
            }
        });

        shapes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        color2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        color2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color2MouseClicked(evt);
            }
        });

        fill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        black12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        editColors1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        kova1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        zoom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        text1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tools1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/tools.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(686, 686, 686))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pen1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eraser1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(350, 350, 350)
                        .addComponent(color2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(griRende, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(black12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(black14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(black15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(black6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(black7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(black17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(black8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(brushes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(black5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(black16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(outline, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(editColors1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(black13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(vishnje, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(610, 610, 610)
                        .addComponent(black18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(shapes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(zoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(fill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(black19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(black4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tools1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pigment1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(griLehte, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(black11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(kova1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paintPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paintPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pen1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(eraser1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(color2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(griRende, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(black12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(black14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(black15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(black6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(black7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(black17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(black8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(brushes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(black5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(black16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(outline, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(editColors1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(black13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(vishnje, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(black18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(shapes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(zoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(fill, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(black19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(black4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tools1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(pigment1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(griLehte, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(black11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(kova1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void color2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseClicked
        tools1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/tools2.PNG"))); // NOI18N

    }//GEN-LAST:event_color2MouseClicked

    private void color1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseClicked
        tools1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/tools.PNG"))); // NOI18N

    }//GEN-LAST:event_color1MouseClicked

    private void sizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeMouseClicked

    }//GEN-LAST:event_sizeMouseClicked

    private void paintPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanel1MouseDragged

        Graphics2D g = (Graphics2D) paintPanel1.getGraphics();
        g.setColor((firstColorChecked) ? firstColor : secondColor);
        int x = evt.getX();
        int y = evt.getY();
        if (!isShape) {
            Tools.pen(g, x, y, 10);
        } else {
            g.setColor(firstColor);
            if (xStartShape <= x && yStartShape <= y) {
                Tools.drawRectangle(g, xStartShape, yStartShape, x - xStartShape, y - yStartShape);
                try {
                    Thread.sleep(45);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
                }
                g.clearRect(xStartShape, yStartShape, x - xStartShape, y - yStartShape);
                repaint();
                revalidate();
                xFinishShape = x;
                yFinishShape = y;
            } else if (xStartShape >= x && yStartShape >= y) {
                g.drawRect(x, y, xStartShape - x, yStartShape - y);
                try {
                    Thread.sleep(100);
                    g.clearRect(x, y, xStartShape - x + 1, yStartShape - y + 1);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
                }
                xFinishShape = x;
                yFinishShape = y;
            }
        }
    }//GEN-LAST:event_paintPanel1MouseDragged

    private void eraser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraser1MouseClicked
        firstColorChecked = false;
        isShape = false;
    }//GEN-LAST:event_eraser1MouseClicked

    private void pen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pen1MouseClicked
        firstColorChecked = true;
        isShape = false;
    }//GEN-LAST:event_pen1MouseClicked

    private void black19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_black19MouseClicked
        firstColor = Color.black;
    }//GEN-LAST:event_black19MouseClicked

    private void whiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteMouseClicked
        firstColor = Color.white;
    }//GEN-LAST:event_whiteMouseClicked

    private void griRendeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_griRendeMouseClicked
        firstColor = Color.GRAY;
    }//GEN-LAST:event_griRendeMouseClicked

    private void griLehteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_griLehteMouseClicked
        firstColor = Color.GRAY;
    }//GEN-LAST:event_griLehteMouseClicked

    private void redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseClicked
        firstColor = Color.red;
    }//GEN-LAST:event_redMouseClicked

    private void orangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orangeMouseClicked
        firstColor = Color.ORANGE;
    }//GEN-LAST:event_orangeMouseClicked

    private void black4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_black4MouseClicked
        firstColor = Color.yellow;
    }//GEN-LAST:event_black4MouseClicked

    private void black5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_black5MouseClicked
        firstColor = Color.GREEN;
    }//GEN-LAST:event_black5MouseClicked

    private void black6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_black6MouseClicked
        firstColor = Color.BLUE;
    }//GEN-LAST:event_black6MouseClicked

    private void outlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outlineMouseClicked
        isShape = true;
        firstColorChecked = true;
    }//GEN-LAST:event_outlineMouseClicked

    private void paintPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanel1MousePressed
        xStartShape = evt.getX();
        yStartShape = evt.getY();
    }//GEN-LAST:event_paintPanel1MousePressed

    private void paintPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanel1MouseReleased
        if (isShape) {
            if (xStartShape >= xFinishShape && yStartShape <= yFinishShape) {
                int temp = xStartShape;
                xStartShape = xFinishShape;
                xFinishShape = temp;
                temp = xFinishShape;
                xFinishShape = xStartShape;
                xStartShape = temp;
            }
            Graphics2D g = (Graphics2D) paintPanel1.getGraphics();
            g.setColor((firstColorChecked) ? firstColor : secondColor);
            Tools.fillRectangle(g, xStartShape, yStartShape, xFinishShape - xStartShape, yFinishShape - yStartShape);
        }
    }//GEN-LAST:event_paintPanel1MouseReleased

    private void paintPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanel1MouseExited
    }//GEN-LAST:event_paintPanel1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel black11;
    private javax.swing.JLabel black12;
    private javax.swing.JLabel black13;
    private javax.swing.JLabel black14;
    private javax.swing.JLabel black15;
    private javax.swing.JLabel black16;
    private javax.swing.JLabel black17;
    private javax.swing.JLabel black18;
    private javax.swing.JLabel black19;
    private javax.swing.JLabel black4;
    private javax.swing.JLabel black5;
    private javax.swing.JLabel black6;
    private javax.swing.JLabel black7;
    private javax.swing.JLabel black8;
    private javax.swing.JLabel brushes;
    private javax.swing.JLabel color1;
    private javax.swing.JLabel color2;
    private javax.swing.JLabel editColors1;
    private javax.swing.JLabel eraser1;
    private javax.swing.JLabel fill;
    private javax.swing.JLabel griLehte;
    private javax.swing.JLabel griRende;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kova1;
    private javax.swing.JLabel orange;
    private javax.swing.JLabel outline;
    private javax.swing.JPanel paintPanel1;
    private javax.swing.JLabel pen1;
    private javax.swing.JLabel pigment1;
    private javax.swing.JLabel red;
    private javax.swing.JLabel shapes;
    private javax.swing.JLabel size;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel tools1;
    private javax.swing.JLabel vishnje;
    private javax.swing.JLabel white;
    private javax.swing.JLabel zoom1;
    // End of variables declaration//GEN-END:variables
}
