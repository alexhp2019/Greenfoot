import greenfoot.*;
import java.util.List;
/**
 * A rock in space.
 * 
 * @author Poul Henriksen
 * @author Michael Kölling
 */
public class Asteroid extends SmoothMover
{
    /** Size of this asteroid */
    private int size;

    /** When the stability reaches 0 the asteroid will explode */
    private int stability;
    private int asteroidCount = 4; 

    /**
     * Create an asteroid with default size and random direction of movement.
     */
    public Asteroid()
    {
        this(50);
    }
    
    /**
     * Create an asteroid with a given size and random direction of movement.
     */
    public Asteroid(int size)
    {
        super(new Vector(Greenfoot.getRandomNumber(360), 2));
        setSize(size);
    }
    
    /**
     * Create an asteroid with a given size and direction of movement.
     */
    public Asteroid(int size, Vector velocity)
    {
        super(velocity);
        setSize(size);
    }
    
    public void act()
    {         
        move();
        checkCollisions();
    }

    /**
     * Set the size of this asteroid. Note that stability is directly
     * related to size. Smaller asteroids are less stable.
     */
    public void setSize(int size) 
    {
        stability = size;
        this.size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }

    /**
     * Return the current stability of this asteroid. (If it goes down to 
     * zero, it breaks up.)
     */
    public int getStability() 
    {
        return stability;
    }
    
    /**
     * Hit this asteroid dealing the given amount of damage.
     */
    public void hit(int damage) 
    {
        stability = stability - damage;
        if (stability <= 0) 
        {
            breakUp();
        }
    }
    
    /**
     * Break up this asteroid. If we are still big enough, this will create two
     * smaller asteroids. If we are small already, just disappear.
     */
    private void breakUp() 
    {
        Greenfoot.playSound("Explosion.wav");
        
        if (size <= 16) {
            if(asteroidCount > 0)
            {
               getWorld().removeObject(this);
               asteroidCount--;
            }
            else 
            {
               getWorld().addObject(new Asteroid(), Greenfoot.getRandomNumber(getWorld().getWidth()/2), Greenfoot.getRandomNumber(getWorld().getHeight()/2));
               asteroidCount++;
            }
        }
        else {
            int r = getVelocity().getDirection() + Greenfoot.getRandomNumber(45);
            double l = getVelocity().getLength();
            Vector speed1 = new Vector(r + 60, l * 1.2);
            Vector speed2 = new Vector(r - 60, l * 1.2);        
            Asteroid a1 = new Asteroid(size/2, speed1);
            Asteroid a2 = new Asteroid(size/2, speed2);
            getWorld().addObject(a1, getX(), getY());
            getWorld().addObject(a2, getX(), getY());        
            a1.move();
            a2.move();
        
            getWorld().removeObject(this);
        }
    }
    
     /**
     * See if this Asteroid has hit a rocket.
     *
     */
   
    
    
    public void checkCollisions()
    
     {
       List<Rocket> rockets = getObjectsInRange(getImage().getWidth()/2, Rocket.class);
         
         if(!rockets.isEmpty())     
       {
         Space s = (Space)getWorld();
         s.addObject(new Explosion(), getX(), getY());
         s.addObject(new ScoreBoard(100), 400, 270);
         s.removeObject(rockets.get(0));
       
       }
      
      }
}
