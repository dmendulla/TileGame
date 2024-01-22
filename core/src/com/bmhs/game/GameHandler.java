package com.bmhs.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameHandler implements ApplicationListener {
	public SpriteBatch batch;
	// public Skin skin;
	public float deltaTime;

	protected Screen screen;

	@Override
	public void create () {
		batch = new SpriteBatch();
		deltaTime = 0;

		setScreen(new TitleScreen(this));
	}

	public void resize(int width, int height) {

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
