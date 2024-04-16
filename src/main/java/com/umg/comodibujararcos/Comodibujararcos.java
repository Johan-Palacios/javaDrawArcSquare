
package com.umg.comodibujararcos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Comodibujararcos {

  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("1. Espiral Cuadrada\n2.Espiral Circular");
    int option = Integer.parseInt(input);
    if (!(option == 1 || option == 2)) {
      JOptionPane.showMessageDialog(null, "Opción no disponible");
    }
    if (option == 1) {
      JFrame frame = new JFrame("Espiral Cuadrada");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new EspiralCuadrada());
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setSize(500, 500);
      frame.setVisible(true);
    }
    if (option == 2) {
      JFrame frame = new JFrame("Spiral Circle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SpiralCircle spiralCircle = new SpiralCircle();
      frame.add(spiralCircle);
      frame.pack();
      frame.setSize(500, 500);
      frame.setVisible(true);
    }
  }
}
