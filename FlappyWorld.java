import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int score = 0;
    int FIRST_PIPE = 240;
    Score scoreObj = null;
    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Set paint order
        setPaintOrder(GameOver.class, Doge.class, Score.class, Pepe.class, FlappyBird.class, TopPipe.class, BotPipe.class);
        
        //Creating and adding the bird object
        FlappyBird johncena = new FlappyBird ();
        addObject(johncena, 100, getHeight()/2);
        
        //Creating score and adding it to the game
        scoreObj = new Score();
        scoreObj.setScore(0);
        addObject(scoreObj, 100, 40);
        
        //Creating the doge and putting it into the game
        Doge doge = new Doge();
        addObject(doge, 40, 40);
    }

    public void act() 
    {
        pipeCounter++;
        if(pipeCounter % 80 == 0){
            int r = Greenfoot.getRandomNumber(230);
            TopPipe tp = new TopPipe();
            addObject(tp, getWidth(), -100+r);
            BotPipe bp = new BotPipe();
            addObject(bp, getWidth(), +300+r);
        }
        if(pipeCounter >= FIRST_PIPE){
            if(flappyCounter % 80 ==0){
                score++;
                scoreObj.setScore(score);
            }
            flappyCounter++;
        }
    }
}