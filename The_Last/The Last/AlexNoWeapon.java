import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlexNoWeapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlexNoWeapon extends Actor
{
    private GreenfootImage image;
    public AlexNoWeapon()
    {
        image = getImage();
        image.scale(60,60);
    }
    /**
     * Act - do whatever the AlexNoWeapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moving();
        turning();
    }
    
    public void turning()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null){
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            
            turnTowards(mouseX, mouseY);
        }
    }
    
    public void moving() {
        int speed = 4; // movement speed
        int changeInX = 0; // horizontal movement
        int changeInY = 0; // movement speed
        if (Greenfoot.isKeyDown("left")) {
        changeInX = -speed;
        }
        if (Greenfoot.isKeyDown("right")) {
        changeInX = speed;
        }
        if (Greenfoot.isKeyDown("up")) {
        changeInY = -speed;
        }
        if (Greenfoot.isKeyDown("down")) {
        changeInY = speed;
        }
        setLocation(getX() + changeInX, getY() + changeInY);
    }
}
