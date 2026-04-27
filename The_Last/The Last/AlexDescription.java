import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlexDescription here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlexDescription extends Actor
{
    public AlexDescription()
    {
        GreenfootImage image = new GreenfootImage(200, 30);
        
        image.setFont(new Font("Times New Roman", true, false, 17));
        image.setColor(Color.DARK_GRAY);
        image.drawString("Perk: Speed Boost", 10, 20);
        setImage(image);
    }
}
