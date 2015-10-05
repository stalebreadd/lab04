// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        Expo.drawRectangle(g,100,200,300,400);
        Expo.drawRectangle(g,150,250,350,450);
        Expo.drawLine(g,100,200,150,250);
        Expo.drawLine(g,300,200,350,250);
        Expo.drawLine(g,100,400,150,450);
        Expo.drawLine(g,300,400,350,450);

 

        // DRAW TARGET
        Expo.drawCircle(g,500,200,50);
        Expo.drawCircle(g,500,200,70);
        Expo.drawCircle(g,500,200,90);
        Expo.drawCircle(g,500,200,30);
        Expo.drawCircle(g,500,200,10);






        // DRAW TRIANGLE
        Expo.drawLine(g,600,450,680,650);
        Expo.drawLine(g,680,650,520,650);
        Expo.drawLine(g,520,650,600,450);
        Expo.drawLine(g,680,650,555,560);
        Expo.drawLine(g,600,450,600,650);
        Expo.drawLine(g,520,650,645,560);
        
        



        // DRAW SMILEY FACE
        Expo.drawOval(g,250,700,120,170);
        Expo.drawCircle(g,210,630,20);
        Expo.drawCircle(g,290,630,20);
        Expo.fillCircle(g,290,630,2);
        Expo.fillCircle(g,210,630,2);
        Expo.drawArc(g,210,620,25,20,270,90);
        Expo.drawArc(g,290,620,25,20,270,90);
        Expo.drawArc(g,250,700,50,25,180,360);     //his nose
        Expo.drawArc(g,250,750,100,50,100,270);






        // DRAW JPII






    }

}


