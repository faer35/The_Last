import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest1 extends World
{
private GreenfootSound backgroundInMatch;
    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest1(int characterValue)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 700, 1); 
        backgroundInMatch = new GreenfootSound("BackgroundInMatch.mp3");
        backgroundInMatch.setVolume(35);
        backgroundInMatch.play();
        if(characterValue == 1){
            prepare1();
        }
        if(characterValue == 2){
            prepare2();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare1()
    {
        AlexNoWeapon alexNoWeapon = new AlexNoWeapon();
        addObject(alexNoWeapon,564,331);
        alexNoWeapon.setLocation(580,375);
        alexNoWeapon.setLocation(593,369);
    }
    
    private void prepare2()
    {
        JohnNoWeapon johnNoWeapon = new JohnNoWeapon();
        addObject(johnNoWeapon, 564,331);
        johnNoWeapon.setLocation(580,375);
        johnNoWeapon.setLocation(593,369);
    }
}
