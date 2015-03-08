package com.juicetin.gameworld;

import com.badlogic.gdx.math.Rectangle;
import com.juicetin.gameobjects.Bird;

/**
 * Created by justinting on 8/03/15.
 */
public class GameWorld {
    
    private Rectangle rect = new Rectangle(0, 0, 17, 12);
    private Bird bird;
    
    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
    }
    
    public void update(float delta) {
//        Gdx.app.log("GameWorld", "update");
//        rect.x++;
//        if (rect.x > 137)
//            rect.x = 
        
        bird.update(delta);
    }
    
    public Bird getBird() {
        return bird;
    }
    
    public Rectangle getRect() {
        return rect;
    }
}
