import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String note;
    
    public Key(String key, String note)
    {
        isDown = false;
        this.key = key;
        this.note = note;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(!isDown && Greenfoot.isKeyDown(key)){
            setImage("white-key-down.png");
            Greenfoot.playSound(note);
            isDown = true;
        }
        
        if(isDown && !Greenfoot.isKeyDown(key)){
            setImage("white-key.png");
            isDown = false;
        }
    }
}

