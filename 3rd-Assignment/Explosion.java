import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        turn(2);
        explosion();
    }
    
    private int explosionTimer = 0;
    
    private void explosion(){
        if (explosionTimer == 40)
        {
            getWorld().removeObject(this);
        }
        
        else
        {
            explosionTimer++;
        }
    }
}
