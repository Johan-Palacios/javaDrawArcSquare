package com.umg.comodibujararcos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class SpiralCircle extends JPanel {
  private int centerX;
  private int centerY;
  private int radius = 20;

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    centerX = getWidth() / 2;
    centerY = getHeight() / 2;
    for (int i = 12; i > 0; i--) {
      if (i % 2 != 0) {
        g.drawArc(
            centerX - i * radius, centerY - i * radius, i * radius * 2, i * radius * 2, 0, 180);
      } else {
        g.drawArc(
            centerX - radius - i * radius,
            centerY - i * radius,
            i * radius * 2,
            i * radius * 2,
            180,
            180);
      }
    }
  }
  }
