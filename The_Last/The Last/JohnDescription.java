import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JohnDescription here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JohnDescription extends Actor
{
    public JohnDescription()
    {
        GreenfootImage image = new GreenfootImage(200, 30);
        
        image.setFont(new Font("Times New Roman", true, false, 17));
        image.setColor(Color.DARK_GRAY);
        image.drawString("Perk: Strength Boost", 10, 20);
        setImage(image);
    }
}
