import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public Score(){
        GreenfootImage newImage = new GreenfootImage(180,50);
        setImage(newImage);
    }
    public void setScore(int score){
        GreenfootImage newImage = getImage();
        newImage.clear();
        Font f = new Font("Comic Sans MS", Font.BOLD, 20);
        newImage.setFont(f);
        Color c = new Color(0,0,0,0);
        newImage.setColor(c);
        newImage.fill();
        newImage.setColor(Color.black);
        newImage.drawString("Score: " + score, 60, 32);
        setImage(newImage);
        Greenfoot.playSound("score.wav");
    }
}
