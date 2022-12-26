import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy(){//constractor
        setRotation(180);
    }
    
    public Enemy(int speed){//1 class can have many constractor
        setRotation(180);
        this.speed = speed;
    }
    
    private int speed = 5;
    
    public void act()
    {
        move(speed);
        moveEnemy();
    }
    
    protected void moveEnemy(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
