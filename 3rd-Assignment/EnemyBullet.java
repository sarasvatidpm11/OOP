import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-8);
        enemyBulletCollision();
    }
    
    protected void enemyBulletCollision(){
        if(isTouching(Hero.class)){
            getWorld().addObject(new Explosion(), getX(),getY());
            
            //removeTouching(Hero.class);
            getWorld().removeObject(this);
        } 
        
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
