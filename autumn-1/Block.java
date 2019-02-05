import greenfoot.*;
import java.util.List;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkIntersecting();
    }
    
    private void checkIntersecting()
    {
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        if(leaf != null){
            leaf.turn(3);
        }
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
          if (isAtEdge()) 
          {
         delta = -delta;  
         getWorld().addObject(new Leaf(),getX(),getY());
           
         List<Apple> apples = getWorld().getObjects(Apple.class);
           for ( Apple a : apples) {
            a.turn(90);
         }
         List<Pear> pears = getWorld().getObjects(Pear.class);
         if(Greenfoot.getX(pears) = 600)
         {
           for ( Pear p : pears) {
            p.move(20);
         }        
        }

       }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {  if (getX() < 300){
             List<Leaf> leaves = getWorld().getObjects(Leaf.class);
                for ( Leaf l : leaves) {
                l.changeImage();
             }               
           }           
        }
    }
    
}
