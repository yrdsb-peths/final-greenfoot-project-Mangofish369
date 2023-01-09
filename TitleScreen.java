import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label title = new Label("Jumping Dinosaur" , 60);
    Button play = new Button("start_button.png", 200, 150);
    //Label start = new Label("Space to start", 50);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        super(600,400,1);
        addObject(title, 300, 150);
        addObject(play, 300, 300);
        //addObject(start, 300, 250);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(play)){
            GameWorld game = new GameWorld();
            Greenfoot.setWorld(game);
        }
    }
}
