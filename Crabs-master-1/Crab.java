import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        if (isAtEdge() ) {
            turn(17);
        }
     
        if (Greenfoot.getRandomNumber(100) < 50) {
           turn(10);
        } 
        else{
            turn(-10);
        }
        move(4);
  }
}