 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bloodstream is the setting for our White Blood Cell scenario. 
 * It's a place where blood cells, bacteria and viruses float around.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Bloodstream extends World
{
    private int time = 2000;
    private int score = 0;
     
    
    public Bloodstream()
    {    
        super(780, 360, 1); 
        setPaintOrder(Border.class,Lining.class,WhiteCell.class,Virus.class,Bacteria.class,RedCell.class);
        
        showTime();
        prepare();
        addScore(0);
    }

    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Bacteria(), 779, (Greenfoot.getRandomNumber(250)) +50);
        }
        if (Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Virus(), 779, (Greenfoot.getRandomNumber(250)) +50);
        }
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Lining(),779,0);
            addObject(new Lining(),779,360);
        }
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new RedCell(), 779, (Greenfoot.getRandomNumber(250)) +50);
        }
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 83, 179);
        Border Border1 = new Border();
        addObject(Border1,740,179);        
        Border Border2 = new Border();
        addObject(Border2,0,179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
        
   
    }
    public void addScore(int score)
    {
        this.score += score;
        showText("score: " + this.score ,80,25);
    }
    
   private void showTime()
    {
        this.time = time;
        showText("time: " + this.time,700,25);
    }
}
