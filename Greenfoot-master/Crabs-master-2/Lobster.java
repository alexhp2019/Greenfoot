import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {       
        move(5);
        if (isTouching(Crab.class)){
            removeTouching(Crab.class);
        }
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }  
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
    }
}
