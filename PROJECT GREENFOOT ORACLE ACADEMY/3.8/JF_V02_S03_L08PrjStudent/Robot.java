import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage gameOver;
    private int lives;
    private int pizzaEaten;
    private int score;
    
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
    }
    
    public Robot()
    {
        robotimage1 = new GreenfootImage("man01.png");
        robotimage2 = new GreenfootImage("man02.png");
        gameOver    = new GreenfootImage("gameover.png");
        
        //Property to store the number of lives.
        lives = 3;
        
        //Property to store the number of Pizza eaten. 
        pizzaEaten = 0;
        
        //Property to store the number of score.
        score = 0;
    }
    
    public void robotMovement()
    {
        //to make the robot move
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(),getY()-2);
                animate();
            }
        
            if(Greenfoot.isKeyDown("down")){
                setLocation(getX(),getY()+2);
                animate();
            } 
        
            if(Greenfoot.isKeyDown("left")){
                setLocation(getX()-2,getY());
                animate();
            }
        
            if(Greenfoot.isKeyDown("right")){
                setLocation(getX()+2,getY());
                animate();
            }
    }
    
    public void detectWallCollision()
    {
        if (isTouching(Wall.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectBlockCollision()
    {
        if (isTouching(Block.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectHome()
    {
        if (isTouching(Home.class) && pizzaEaten==5){
            increaseScore();
            setLocation(48,50);
            Greenfoot.playSound("yipee.wav");
            
            //Reset the pizza counter to 0 if the game is finnished
            pizzaEaten = 0;
        }
    }
    
    public void eatPizza()
    {
        if (isTouching(Pizza.class)){
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    
    public void animate()
    {
        //Animation on the robot if it makes a move
        if (getImage().equals(robotimage1))
        {
            setImage(robotimage2);
        }
        
        else
        {
            setImage(robotimage1);
        }
    }
    
    public void removeLife()
    {
        //Decrease the number of lives by one
        lives = lives-1;
        
        testEndGame();
        showStatus();
    }
    
    public void testEndGame()
    {
        //If the number of lives is less than 0 then the game ends
        if (lives < 0)
        {
            setImage(gameOver);
            Greenfoot.stop();
        }
    }
    
    public void increaseScore()
    {
        //Increase the score every time reach home
        if (pizzaEaten==5)
        {
            score++;
        }
        showStatus();
    }
    
    public void showStatus()
    {
        //Display the number of lives and score to the scorepanel
        getWorld().showText("Lives : "+lives,71,530);
        getWorld().showText("Pizza : "+pizzaEaten,71,555);
        getWorld().showText("Score : "+score,71,580);
    }
}
