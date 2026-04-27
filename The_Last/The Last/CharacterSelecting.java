import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterSelecting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelecting extends World
{

    /**
     * Constructor for objects of class CharacterSelecting.
     * 
     */
    public CharacterSelecting()
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
        AlexIcon alexIcon = new AlexIcon();
        addObject(alexIcon,337,302);
        JohnIcon johnIcon = new JohnIcon();
        addObject(johnIcon,760,274);
        johnIcon.setLocation(702,367);
        alexIcon.setLocation(344,359);
        johnIcon.setLocation(725,376);
        alexIcon.setLocation(402,354);
        johnIcon.setLocation(701,366);
        alexIcon.setLocation(330,326);
        johnIcon.setLocation(707,314);
        johnIcon.setLocation(724,330);
        johnIcon.setLocation(684,364);
        alexIcon.setLocation(388,362);
        alexIcon.setLocation(363,362);
        johnIcon.setLocation(734,360);
        johnIcon.setLocation(696,363);
        johnIcon.setLocation(689,355);
        johnIcon.setLocation(724,364);
        johnIcon.setLocation(733,361);
        johnIcon.setLocation(722,360);
        johnIcon.setLocation(728,343);
        johnIcon.setLocation(712,363);
        johnIcon.setLocation(668,339);
        johnIcon.setLocation(688,360);
        johnIcon.setLocation(685,364);
        johnIcon.setLocation(687,363);
        johnIcon.setLocation(682,350);
        johnIcon.setLocation(684,358);
        johnIcon.setLocation(700,359);
        alexIcon.setLocation(379,349);
        alexIcon.setLocation(373,359);
        alexIcon.setLocation(366,359);
        alexIcon.setLocation(359,358);
        alexIcon.setLocation(357,357);
        alexIcon.setLocation(384,355);
        alexIcon.setLocation(388,358);
        alexIcon.setLocation(383,358);
        alexIcon.setLocation(368,350);
        alexIcon.setLocation(394,363);
        alexIcon.setLocation(362,357);
        alexIcon.setLocation(375,372);
        johnIcon.setLocation(690,335);
        alexIcon.setLocation(382,341);
        alexIcon.setLocation(382,331);
        alexIcon.setLocation(381,333);
        alexIcon.setLocation(400,350);
        alexIcon.setLocation(380,333);
        alexIcon.setLocation(342,316);
        alexIcon.setLocation(367,335);
        alexIcon.setLocation(411,325);
        alexIcon.setLocation(376,332);
        alexIcon.setLocation(401,378);
        alexIcon.setLocation(391,333);
        alexIcon.setLocation(392,336);
        alexIcon.setLocation(404,327);
        alexIcon.setLocation(382,334);
        alexIcon.setLocation(376,334);
        alexIcon.setLocation(370,334);
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,654,594);
        removeObject(exitButton);
        BackButton backButton = new BackButton();
        addObject(backButton,191,609);
        backButton.setLocation(170,646);
        backButton.setLocation(143,644);
        backButton.setLocation(114,645);
        backButton.setLocation(123,645);
        backButton.setLocation(163,620);
        backButton.setLocation(181,632);
        backButton.setLocation(149,627);
    }
}
