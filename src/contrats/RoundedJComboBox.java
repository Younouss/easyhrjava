/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrats;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author h
 */
public class RoundedJComboBox<String> extends JComboBox<String>{
    private Shape shape;
    ImageIcon icon;
    public RoundedJComboBox() {
        this.setOpaque(false);
        //this.icon = new ImageIcon(getClass().getResource(icon));
        //Image l = this.icon.getImage();
        //Image newImage = l.getScaledInstance(15, 15,java.awt.Image.SCALE_SMOOTH);  
        //this.icon = new ImageIcon(newImage);
        /*String TEXT_NOT_TO_TOUCH = "      ";
        this.setText(TEXT_NOT_TO_TOUCH);
        int length = this.getDocument().getLength();
        //System.out.println(length);
        this.setCaretPosition(6);*/
        /*((AbstractDocument) this.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (offset < TEXT_NOT_TO_TOUCH.length()) {
                    return;
                }
                super.insertString(fb, offset, string, attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (offset < TEXT_NOT_TO_TOUCH.length()) {
                    length = Math.max(0, length - TEXT_NOT_TO_TOUCH.length());
                    offset = TEXT_NOT_TO_TOUCH.length();
                }
                super.replace(fb, offset, length, text, attrs);
            }

            @Override
            public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                if (offset < TEXT_NOT_TO_TOUCH.length()) {
                    length = Math.max(0, length + offset - TEXT_NOT_TO_TOUCH.length());
                    offset = TEXT_NOT_TO_TOUCH.length();
                }
                if (length > 0) {
                    super.remove(fb, offset, length);
                }
            }
        });*/
    }
    @Override
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         //icon.paintIcon(null, g, 3, 1);
         super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g) {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         //g.drawLine(0, getHeight()-1, getWidth()-1, getHeight()-1);
    }
    @Override
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}
