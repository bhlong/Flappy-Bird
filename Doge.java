import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Doge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doge extends Actor
{
    /**
     * Act - do whatever the Doge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Doge(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
}
