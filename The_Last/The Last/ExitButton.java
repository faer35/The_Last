import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Actor
{
    private GreenfootImage image;
    public ExitButton()
    {
       image = getImage();
       image.scale(150, 40);
       
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
            World world = getWorld();
            
            world.removeObject(this);
            world.removeObjects(world.getObjects(PerkBoard.class));
            
            world.removeObjects(world.getObjects(JohnSelectButton.class));
            world.removeObjects(world.getObjects(JohnName.class));
            world.removeObjects(world.getObjects(Strength.class));
            world.removeObjects(world.getObjects(JohnDescription.class));
            
            world.removeObjects(world.getObjects(AlexSelectButton.class));
            world.removeObjects(world.getObjects(AlexName.class));
            world.removeObjects(world.getObjects(Speed.class));
            world.removeObjects(world.getObjects(AlexDescription.class));
            
        }
    }
}
