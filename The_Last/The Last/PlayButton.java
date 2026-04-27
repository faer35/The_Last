import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    private GreenfootImage image;

    public PlayButton()
    {   
        image = getImage();
        image.scale(200, 60);
        
        setImage(image);
    }
    
    public void act()
    {
        clicked();
    }
    
    public void clicked()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Clicked.mp3");
            Greenfoot.setWorld(new CharacterSelecting());
        }
    }
}
