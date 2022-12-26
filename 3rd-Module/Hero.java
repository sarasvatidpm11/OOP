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
          
    }
    
    public void moveHero()
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
    
    int laserTimer = 0;
    public void shootLaser()
    {
        if (laserTimer == 30)
        {
            getWorld().addObject(
                new Laser(),
                getX() + 5,
                getY()
            );
            
            laserTimer = 0;
        }
        
        else
        {
            laserTimer++;
        }
    }
}       