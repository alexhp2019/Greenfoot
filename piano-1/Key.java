import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String colour;
    private String key;
    private String note;
    
    public Key(String colour, String key, String note)
    {;
        isDown = false;
        this.colour = colour;
        this.key = key;
        this.note = note;
        setImage(colour + "-key.png");
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(!isDown && Greenfoot.isKeyDown(key)){
            setImage(colour + "-key-down.png");
            Greenfoot.playSound(note);
            isDown = true;
        }
        
        if(isDown && !Greenfoot.isKeyDown(key)){
            setImage(colour + "-key.png");
            isDown = false;
        }
    }
}

