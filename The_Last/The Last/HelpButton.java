import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Actor
{
    private GreenfootImage image;
    public HelpButton()
    {
       image = getImage();
       image.scale(200, 60);
        
       setImage(image);
    }
    
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        clicked();
    }
    
    public void clicked()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Clicked.mp3");
            Greenfoot.setWorld(new Help());
        }
    }
}
