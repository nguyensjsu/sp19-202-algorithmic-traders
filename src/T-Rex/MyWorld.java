import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cactus cactus = new Cactus();
        addObject(cactus,75,315);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,247,312);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,444,311);
        Stones stones = new Stones();
        addObject(stones,343,348);
        Stones stones2 = new Stones();
        addObject(stones2,164,276);
        stones.setLocation(367,257);
        cactus2.setLocation(307,319);
        cactus2.setLocation(301,319);
        cactus3.setLocation(475,313);
    }
}