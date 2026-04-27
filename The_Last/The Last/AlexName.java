import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlexDescription here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlexName extends Actor
{
    public AlexName()
    {
        GreenfootImage image = new GreenfootImage(180, 50);

        image.setFont(new Font("Arial", true, false, 28)); // bigger size (28)
        image.setColor(Color.BLACK);
        image.drawString("Alex", 12, 30); // adjust position
        setImage(image);
        
    }
}
