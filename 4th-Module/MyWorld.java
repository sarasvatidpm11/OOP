import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,55,195);
        
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,550,125);
        
        //Enemy enemy = new Enemy();
        //addObject(enemy,561,289);
    }
    
    public void act (){
        spawnEnemy();
        spawnEnemy();
        spawnEnemy();
        heroLife();
    }
    
    private int timerEnemy = 0;
    
    private void spawnEnemy(){
        if (timerEnemy==180){//if timer = 3s
            //Enemy enemy = new Enemy();
            //int speed = Greenfoot.getRandomNumber(4)+1;
            addObject(
                new Enemy(Greenfoot.getRandomNumber(4)+1), 
                599, 
                Greenfoot.getRandomNumber(400));
            
            timerEnemy = 0;
        }
        else{
            timerEnemy++;
        }
    }
    
    private int life = 3;
    
    private void heroLife(){
        showText("Hero Life :" +life, 80, 20);
    }
    
    public void lifeCalculate(){
        life = life - 1;
        
        if (life == 0){
            Greenfoot.stop();
            addObject(new GameOver(),300,200);
        }
        
        else{
            heroLife();
        }
    }
    /*public void act(){
        if(Greenfoot.getRandomNumber(180) == 1){
            int y = Greenfoot.getRandomNumber(400);
            addObject(new Enemy(), 599, y);
        }
    }*/
}
