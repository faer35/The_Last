import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JohnIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JohnIcon extends Actor
{
    private GreenfootImage image;
    public JohnIcon()
    {
        image = getImage();
        image.scale(150,150);
    }
    
    public void act()
    {
        clicked();
        
    }
    
    private void clicked()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Clicked.mp3");
            World world = getWorld();
            
            world.removeObjects(world.getObjects(ExitButton.class));
            world.removeObjects(world.getObjects(PerkBoard.class));
            world.removeObjects(world.getObjects(AlexSelectButton.class));
            world.removeObjects(world.getObjects(AlexName.class));
            world.removeObjects(world.getObjects(Speed.class));
            world.removeObjects(world.getObjects(AlexDescription.class));
            
            world.addObject(new PerkBoard(), 700, 350);
            world.addObject(new JohnSelectButton(), 700, 420);
            world.addObject(new ExitButton(), 700, 470);
            world.addObject(new JohnName(), 744, 230);
            world.addObject(new Strength(), 699, 280);
            world.addObject(new JohnDescription(), 714, 335);
        }
    }
}
