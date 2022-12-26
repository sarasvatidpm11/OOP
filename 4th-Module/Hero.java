import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /*move(2);
        
        if(isAtEdge()){
            setLocation(0,getY());
        }*/
        
        moveHero();
        shootLaser();
        heroDead();
          
    }
    
    private void moveHero()
        {
           if(Greenfoot.isKeyDown("W")){
                setLocation(getX(),getY()-2);
            }
        
            if(Greenfoot.isKeyDown("S")){
                setLocation(getX(),getY()+2);
            } 
        
            if(Greenfoot.isKeyDown("A")){
                setLocation(getX()-2,getY());
            }
        
            if(Greenfoot.isKeyDown("D")){
                setLocation(getX()+2,getY());
            }

        }
    
    private int laserTimer = 0;
    private void shootLaser()
    {
        if (laserTimer == 10)
        {
            getWorld().addObject(
                new Laser(),
                getX() + 75,
                getY() + 13
            );
            
            laserTimer = 0;
        }
        
        else
        {
            laserTimer++;
        }
    }
    
    private void heroDead()
    {
        if (isTouching(Enemy.class)){
            MyWorld world; 
            world = (MyWorld)getWorld();
            world.lifeCalculate();
            
            setLocation(55,195);
            
        }
    }
}       