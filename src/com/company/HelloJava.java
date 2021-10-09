package com.company;

import javax.swing.*;
import java.awt.*;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello World! и по Русски тоже: Привет, Мир!");
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Вукуся, я люблю тебя!", JLabel.CENTER);
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.add(label);
        frame.add(new HelloComponent());
    }
}

class HelloComponent extends JComponent{
    public void paintComponent (Graphics g){
        g.drawString("Hello, Java!", 125, 95);
    }
}
