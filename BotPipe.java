import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotPipe extends Actor
{
    int PIPE_SPEED = 3;
    /**
     * Act - do whatever the BotPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-PIPE_SPEED,getY());
    }    
}
