import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
  /**
   * Create a crab and initialize its images
   */
  public Crab(){
      new GreenfootImage("crab.png");
      new GreenfootImage("crab2.png");
      setImage(image1);
    }
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
        }
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