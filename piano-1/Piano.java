import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    int count = 0;
    int xKey = 53;
    public Piano() 
    {
        super(800, 340, 1);   
       
       
        while(count<12)
        {
            addObject(new Key("g", "3a.wav"), xKey, 140);
            xKey+= 63;
            count++;
        }
    }
}