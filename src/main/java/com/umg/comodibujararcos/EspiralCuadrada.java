package com.umg.comodibujararcos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class EspiralCuadrada extends JPanel {


  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int lineGrow = getWidth() / 10;
    int lineLenght = lineGrow;
    int direction = 0;
    int midleX = getWidth() / 2;
    int midleY = getHeight() / 2;
    int x = midleX;
    int y = midleY;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < lineLenght; k++) {
          switch (direction % 4) {
            case 0:
              y--;
              break;
            case 1:
              x--;
              break;
            case 2:
              y++;
              break;
            case 3:
              x++;
              break;
          }
          g.drawLine(x, y, x, y);
        }

        if (j % 2 != 0) {
          lineLenght += lineGrow;
        }

        direction++;
      }
    }
  }
}
