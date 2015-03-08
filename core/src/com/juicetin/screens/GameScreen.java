package com.juicetin.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.juicetin.gameworld.GameRenderer;
import com.juicetin.gameworld.GameWorld;
import com.juicetin.zbhelpers.InputHandler;

/**
 * Created by justinting on 8/03/15.
 */
public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;
    
    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);
        
        int midPointY = (int) (gameHeight / 2);
        
        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world);
        
        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    @Override
    public void render(float delta) {
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
