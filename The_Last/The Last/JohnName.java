import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JohnName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JohnName extends Actor
{
    public JohnName()
    {
        GreenfootImage image = new GreenfootImage(180,50);
        
        image.setFont(new Font("Arial",true, false, 28));
        image.setColor(Color.BLACK);
        image.drawString("John",12,30);
        setImage(image);
    }
}