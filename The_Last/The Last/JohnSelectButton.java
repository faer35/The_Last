import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JohnSelectButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JohnSelectButton extends Actor
{
    private GreenfootImage image;
    public JohnSelectButton()
    {
        image = getImage();
        image.scale(150, 40);
        
        setImage(image);
    }
    
    /**
     * Act - do whatever the AlexSelectButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        clicked();
    }
    
    private void clicked()
    {
        if (Greenfoot.mouseClicked(this)){  
            Greenfoot.playSound("Selected.mp3");
            Greenfoot.setWorld(new Forest1(2));
        }
    }
}
