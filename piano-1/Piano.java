import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    private String[] blackKeys = 
    {"w","e","","t","y","u","","o","p","","]",};
    private String[] blackNotes = 
    {"3c#","3d#","","3f#","3g#","3a#","","3b#","4c#","","4d#",};
    private String[] whiteKeys = 
    {"a","s","d","f","g","h","j","k","l",";","'","\\",};
    private String[] whiteNotes = 
    {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g",};
    public Piano() 
    {super(800, 340, 1);   
      
        int i = 0;
        while(i<12)
        {
            addObject(new Key ("white", whiteKeys[i], whiteNotes[i] + ".wav"), i*63+55, 140);
            i++;
        }
        int m = 0;
        while(m<11)
        {
            if(blackKeys[m] == "")
           {
               m++;
           }
            else{
                addObject(new Key ("black", blackKeys[m], blackNotes[m] + ".wav"), m*63+87, 70);
               m++;
            }
        }
    }
}