package com.juicetin.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.juicetin.gameworld.GameRenderer;
import com.juicetin.gameworld.GameWorld;

/**
 * Created by justinting on 8/03/15.
 */
public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;
    
    public GameScreen() {
        Gdx.app.log("GameScree", "Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void render(float delta) {
//        //Sets colour to fill screen
//        Gdx.gl.glClearColor(10 / 255.0f, 15 / 255.0f, 230 / 255.0f, 1f);
//
//        //Fills screen with selected colour
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        
//        //Convert frame rate to String, print it
//        Gdx.app.log("GameScreen FPS", (1/delta) + "");
        
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "Resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void dispose() {
    }
}
