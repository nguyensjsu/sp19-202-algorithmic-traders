import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class LifeBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeBar extends Actor implements ILifeBar,ITRexObserver
{
    int life = 6;
    int lifeBarWidth = 120; 
    int lifeBarHeight = 15;
    int pixelsPerLifePoint = (int)lifeBarWidth / life;

    /**
     * Act - do whatever the LifeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public LifeBar()
    {
        setImage(new GreenfootImage(lifeBarWidth + 2, lifeBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0,lifeBarWidth + 1, lifeBarHeight + 1);
    }

    public GreenfootImage display()
    {
        setImage(new GreenfootImage(lifeBarWidth + 2, lifeBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0,lifeBarWidth + 1, lifeBarHeight + 1);
        return myImage;
    }

    public void looseLife()
    {
        life--;
    }

    public int getLife()
    {
        return life;
    }
    public void update(String type)
    {
        if(type.equals("Bird") ||type.equals("Cactus")||type.equals("Stones"))
        looseLife();
        
    }
}