import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class T13 {

 public static void main(String[] arg) {

 MyFrame f = new MyFrame("다각형그리기");

 }

}


class MyFrame extends JFrame {

 MyFrame(String title) {

 super(title);

 setSize(500,500);

 setDefaultCloseOperation(EXIT_ON_CLOSE);

 makeUI();

 setVisible(true);

 }

 private void makeUI() {

 MyPanel p = new MyPanel();

 add(p, BorderLayout.CENTER);

 }

}


class MyPanel extends JPanel {

 protected void paintComponent(Graphics g) {


int x[] = { 20, 60, 110 }; 
int y[] = { 100, 30, 100 }; 
g.drawPolygon( x, y, 3 );       // 삼각형그리기

 

int x1[] = { 330, 430, 430, 330 }; 
int y1[] = { 20,  20, 100,  100 }; 
g.drawPolygon( x1, y1, 4 );     //  사각형그리기


int x2[] = { 210,175,60,150,110,210,310,270,360,245,210 }; 
int y2[] = { 60,160,160,225,340,270,340,225,160,160,60 }; 
g.drawPolygon( x2, y2, 10 );     //  별그리기

 }

}