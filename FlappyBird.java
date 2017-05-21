import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = -10;
    double g = 0.6;
    double BOOST_SPEED = -7.3;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        //gravity
        setLocation( getX(), (int)(getY() + dy) );
        if (getWorld().getObjects(Restart.class).isEmpty())
        {
            //changing the direction of the bird
            if(dy<-5){
                setRotation(-30);
            }else if(-5<dy && dy<5){
                setRotation(0);
            }else if(dy>5){
                setRotation(30);
            }

            //If bird hits pipes, game over
            if(getOneIntersectingObject(TopPipe.class) != null){
                displayGameOver();
            }
            if(getOneIntersectingObject(BotPipe.class) != null){
                displayGameOver();
            }

            // If up key is pressed, the bird wil launch upwards
            if (Greenfoot.isKeyDown("up")==true){
                Greenfoot.playSound("click.wav");
                dy=BOOST_SPEED;
            }

            //if bird falls on the ground, game over
            if (getY() > getWorld().getHeight()){
                displayGameOver();
            }
            
            dy = dy +g;
        } else{
            dy = 0;
        }
        //increasing the speed in which the bird is fallig at
        
    }

    private void displayGameOver(){
        GameOver attitudeadjustment = new GameOver();
        getWorld().addObject(attitudeadjustment, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Restart restart = new Restart();
        getWorld().addObject(restart, getWorld().getWidth()/2, getWorld().getHeight()/2 + 40);
        Greenfoot.playSound("gameover.wav");
    }
}
