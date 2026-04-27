import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlexIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlexIcon extends Actor
{
    private GreenfootImage image;
    
    public AlexIcon()
    {
        image = getImage();
        image.scale(150,150);
    }
    
        public void act()
    {
        clicked();
    }
    
    public void clicked()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Clicked.mp3");
            
            World world = getWorld();
            
            world.removeObjects(world.getObjects(ExitButton.class));
            world.removeObjects(world.getObjects(PerkBoard.class));
            world.removeObjects(world.getObjects(JohnSelectButton.class));
            world.removeObjects(world.getObjects(JohnName.class));
            world.removeObjects(world.getObjects(Strength.class));
            world.removeObjects(world.getObjects(JohnDescription.class));
            
            world.addObject(new PerkBoard(), 360, 350);
            world.addObject(new AlexSelectButton(), 360, 420);
            world.addObject(new ExitButton(), 360, 470);
            world.addObject(new AlexName(), 410, 230);
            world.addObject(new Speed(), 359, 280);
            world.addObject(new AlexDescription(), 384, 335);
        }
    }
}
