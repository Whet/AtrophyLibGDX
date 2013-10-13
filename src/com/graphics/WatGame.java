package com.graphics;

import com.actions.MouseCollection;
import com.atrophy.screens.SplashScreen;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WatGame extends Game implements ApplicationListener, InputProcessor {

	private float stateTime;
	private SpriteBatch spriteBatch;
	DrawCollection rootDraw;
    MouseCollection rootMouse;
	
    @Override
    public void create() {
    	
    	Texture.setEnforcePotImages(false);
    	
    	stateTime = 0f;
    	
        spriteBatch = new SpriteBatch();
        
        rootDraw = new DrawCollection();
        rootMouse = new MouseCollection();
        
        Gdx.input.setInputProcessor(this);
        
        this.setScreen(new SplashScreen(this));
        
    }
 
    @Override
    public void resize( int width, int height) {
    }
 
    @Override
    public void render() {
        // the following code clears the screen with the given RGB color (green)
        Gdx.gl.glClearColor(0f, 1f, 0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        // output the current FPS
//        fpsLogger.log();
        
        
        stateTime += Gdx.graphics.getDeltaTime();
        
        spriteBatch.begin();
        
        rootDraw.draw(spriteBatch, stateTime);
        
        spriteBatch.end();
        
    }
 
    @Override
    public void pause() {
    }
 
    @Override
    public void resume() {
    }
 
    @Override
    public void dispose() {
    }

	@Override
	public boolean keyDown(int key) {
		return false;
	}

	@Override
	public boolean keyTyped(char key) {
		return false;
	}

	@Override
	public boolean keyUp(int key) {
		return false;
	}

	@Override
	public boolean mouseMoved(int arg0, int arg1) {
		return false;
	}

	@Override
	public boolean scrolled(int arg0) {
		return false;
	}

	@Override
	public boolean touchDown(int arg0, int arg1, int arg2, int arg3) {
		return this.rootMouse.mD(Gdx.input.getX(), Gdx.input.getY());
	}

	@Override
	public boolean touchDragged(int arg0, int arg1, int arg2) {
		return false;
	}

	@Override
	public boolean touchUp(int arg0, int arg1, int arg2, int arg3) {
		return this.rootMouse.mU(Gdx.input.getX(), Gdx.input.getY());
	}
    

}
