import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    int z = 0;
    int s = 190;
    int d = 0;
     private void setup()
    {
        while(z<18){
            Bubble bubble = new Bubble(s,d);
            addObject(bubble, 450,300); 
            s-=10;
            d+=20;
            z++;
        }
    }
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
    }
   
}
