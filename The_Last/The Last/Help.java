import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackButton backButton = new BackButton();
        addObject(backButton,330,519);
        backButton.setLocation(173,637);
        backButton.setLocation(173,625);
        backButton.setLocation(164,629);
        backButton.setLocation(208,629);
        backButton.setLocation(187,630);
        backButton.setLocation(167,620);
        backButton.setLocation(174,624);
        backButton.setLocation(160,624);
    }
}
