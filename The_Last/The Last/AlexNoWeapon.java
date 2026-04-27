import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlexNoWeapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class AlexNoWeapon extends Actor
{
    private GreenfootImage[] walkingFrames;
    private int currentFrame = 0;
    private int animationTimer = 0;
    private final int ANIMATION_DELAY = 10; 

    public AlexNoWeapon()
    {
        
        walkingFrames = new GreenfootImage[3];
        walkingFrames[0] = new GreenfootImage("Alex_Left.png");
        walkingFrames[1] = new GreenfootImage("AlexNoWeapon.png");
        walkingFrames[2] = new GreenfootImage("AlexRight.png");

        
        for (int i = 0; i < walkingFrames.length; i++) {
            walkingFrames[i].scale(60, 60);
        }

        
        setImage(walkingFrames[1]);
    }

    public void act()
    {
        moving();
        turning();
        shooting(); 
    }
    
    public void shooting()
    {
        if (Greenfoot.mouseClicked(null))
        {
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
        }
    }
    
    public void turning()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null){
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    
    public void moving() {
        int speed = 4;
        int changeInX = 0;
        int changeInY = 0;
        boolean isMoving = false;

        
        if (Greenfoot.isKeyDown("left"))  { changeInX = -speed; isMoving = true; }
        if (Greenfoot.isKeyDown("right")) { changeInX = speed;  isMoving = true; }
        if (Greenfoot.isKeyDown("up"))    { changeInY = -speed; isMoving = true; }
        if (Greenfoot.isKeyDown("down"))  { changeInY = speed;  isMoving = true; }

        setLocation(getX() + changeInX, getY() + changeInY);

        
        if (isMoving) {
            animate();
        } else {
            setImage(walkingFrames[1]); // 
        }
    }

    private void animate() {
        animationTimer++;
        
        if (animationTimer >= ANIMATION_DELAY) {
            // Cycle: 0 -> 1 -> 2 -> 0...
            currentFrame = (currentFrame + 1) % walkingFrames.length;
            setImage(walkingFrames[currentFrame]);
            animationTimer = 0;
        }
    }
}
