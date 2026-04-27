import greenfoot.*;

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;  

public class Skeleton extends Actor
{
    private GreenfootImage[] walkingFrames;
    private int currentFrame = 0;
    private int animationTimer = 0;
    private final int ANIMATION_DELAY = 8;

    public Skeleton()
    {
        
        walkingFrames = new GreenfootImage[3];
        walkingFrames[0] = new GreenfootImage("SkeletonLeft.png");
        walkingFrames[1] = new GreenfootImage("Skeleton.png");
        walkingFrames[2] = new GreenfootImage("SkeletonRight.png");

        
        for (int i = 0; i < walkingFrames.length; i++) {
            walkingFrames[i].scale(60, 60);
        }

        
        setImage(walkingFrames[1]);
    }

    public void act() 
    {
        followPlayer();
        handleWallCollision();
        checkAttack();
    }

    public void followPlayer()
    {
        Actor target = null;
        
        
        if (!getWorld().getObjects(JohnNoWeapon.class).isEmpty()) {
            target = (Actor) getWorld().getObjects(JohnNoWeapon.class).get(0);
        } else if (!getWorld().getObjects(AlexNoWeapon.class).isEmpty()) {
            target = (Actor) getWorld().getObjects(AlexNoWeapon.class).get(0);
        }

        if (target != null) {
            turnTowards(target.getX(), target.getY());
            move(3); 
            animate(); 
        } else {
            setImage(walkingFrames[1]); 
        }
    }

    private void animate() 
    {
        animationTimer++;
        if (animationTimer >= ANIMATION_DELAY) {
            currentFrame = (currentFrame + 1) % walkingFrames.length;
            setImage(walkingFrames[currentFrame]);
            animationTimer = 0;
        }
    }

    public void handleWallCollision()
    {
        if (isAtEdge()) {
            turn(180);
            move(10);
        }
    }

    public void checkAttack()
    {
        
        if (isTouching(JohnNoWeapon.class) || isTouching(AlexNoWeapon.class)) {
            
            getWorld().removeObject(this);
        }
    }
}
