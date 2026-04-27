import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 700, 1); 
        setBackground("Menu.png");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton play = new PlayButton();
        addObject(play,565,387);
        play.setLocation(880,607);
        play.setLocation(890,612);
        play.setLocation(856,596);
        play.setLocation(856,598);
        play.setLocation(833,587);
        play.setLocation(839,567);
        play.setLocation(864,613);
        play.setLocation(896,594);
        play.setLocation(884,583);
        play.setLocation(862,580);
        play.setLocation(876,587);
        play.setLocation(843,575);
        play.setLocation(886,575);
        play.setLocation(922,586);
        play.setLocation(868,584);
        play.setLocation(874,544);
        play.setLocation(868,536);
        play.setLocation(868,541);
        play.setLocation(874,540);
        play.setLocation(856,541);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,836,614);
        helpButton.setLocation(872,611);
        helpButton.setLocation(868,610);
        helpButton.setLocation(856,613);
    }
}
