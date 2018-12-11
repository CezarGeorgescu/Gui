package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {
        private JButton button;
        private JFrame window;
        private DrawPanel panel;

    public static void main(String[] args) {
        new SimpleGui().run();



    }

    private void run() {
        window = new JFrame();

        button = new JButton("change color");
        panel = new DrawPanel();
        button.addActionListener(this);
        window.getContentPane().add(BorderLayout.SOUTH, button);
        window.getContentPane().add(BorderLayout.CENTER, panel);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setVisible(true);
        moveCircle();
    }

    public void changeText (){
        button.setText("Te-am pupat");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeColor();

    }

    private void changeColor() {
        window.repaint();
    }
    int y;
    private void moveCircle(){

        for ( int x = 0; x <= panel.getWidth()-60; x++ ) {
            panel.setXY(x, x);
            window.repaint();
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
