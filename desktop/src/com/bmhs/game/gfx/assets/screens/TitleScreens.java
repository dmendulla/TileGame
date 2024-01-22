package com.bmhs.game.gfx.assets.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.bmhs.game.GameHandler;

public class TitleScreen implements Screen {

    GameHandler game;

    public TitleScreen(final GameHandler game) {
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {
        if(screen != null)
            screen .resize(width, height);
    }

    @Override
    public void hide() {

    }

    public void pause() {
        if (screen != null)
            screen.pause();
    }

    public void resume() {
        if (screen != null)
            screen.resume();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public void setScreen(Screen screen) {
        if(this.screen != null) {
            this.screen.hide();
        }
        this.screen = screen;
        if(this.screen != null) {
            this.screen.show();
            this.screen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
    }
}
