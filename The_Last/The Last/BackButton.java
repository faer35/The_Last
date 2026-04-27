import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Actor
{
    private GreenfootImage image;
    public BackButton()
    {
       image = getImage();
       image.scale(200, 60);
        
       setImage(image);
    }
    
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
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
            Greenfoot.setWorld(new Menu());
        }
    }
}
