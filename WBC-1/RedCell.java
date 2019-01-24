import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCell extends Actor
{
    int speed = Greenfoot.getRandomNumber(1)+1;
    public void act() 
    {
        setLocation(getX() - speed, getY());
        turn(1);
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    
    }    
}
