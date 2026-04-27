import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    public Bullet()
    {
        // 1. Create a new blank image (width, height)
        GreenfootImage image = new GreenfootImage(10, 5); 
        
        // 2. Set the "drawing pen" color to black
        image.setColor(Color.BLACK);
        
        // 3. Fill the image with that color
        image.fill();
        
        // 4. Assign the image to this Actor
        setImage(image);
    }

    public void act()
    {
        move(8);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
