package com.juicetin.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by justinting on 8/03/15.
 */
public class GameRenderer {
    
    private GameWorld world;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    
    public GameRenderer (GameWorld world) {
        this.world = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }
    
    public void render() {
        Gdx.app.log("GameRenderer", "render");
        
        //Draw black background to prevent flickering
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        //Draw filled rectangle
        //tell shaperenderer to begin drawing
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        //draws rect from myWorld using shapetype.filled
        shapeRenderer.rect(world.getRect().x, world.getRect().y, 
                world.getRect().width, world.getRect().height);
        //tells renderer to finish rendering - MUST DO EVERY TIME
        shapeRenderer.end();
        
        //Draw rectangle outline
        //tells renderer to draw outline of the following shape
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        //choses rgb colour of 255,109,120 at full opacity
        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        //draws rectangle from myworld using shapetype.line
        shapeRenderer.rect(world.getRect().x, world.getRect().y,
                world.getRect().width, world.getRect().height);
        
        shapeRenderer.end();
    }
}
