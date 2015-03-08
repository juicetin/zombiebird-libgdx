package com.justin.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by justinting on 8/03/15.
 */
public class GameScreen implements Screen {
    public GameScreen() {
        Gdx.app.log("GameScree", "Attached");
    }

    @Override
    public void render(float delta) {
        //Sets colour to fill screen
        Gdx.gl.glClearColor(10 / 255.0f, 15 / 255.0f, 230 / 255.0f, 1f);

        //Fills screen with selected colour
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        //Convert frame rate to String, print it
        
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
