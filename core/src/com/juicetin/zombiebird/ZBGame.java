package com.juicetin.zombiebird;

//import com.badlogic.gdx.ApplicationAdapter;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//
//public class ZBGame extends ApplicationAdapter {
//	SpriteBatch batch;
//	Texture img;
//
//	@Override
//	public void create () {
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
//	}
//
//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
//}

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.juicetin.screens.GameScreen;

public class ZBGame extends Game {
        
    @Override
    public void create() {
        Gdx.app.log("ZBGame", "created");
        setScreen(new GameScreen());
    }
}