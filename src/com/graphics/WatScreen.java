package com.graphics;

import com.actions.MouseCollection;
import com.badlogic.gdx.Screen;

public class WatScreen implements Screen {

	protected WatGame game;
	
	public WatScreen(WatGame game) {
		this.game = game;
	}
	
	@Override
	public void dispose() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void render(float arg0) {
		game.render();
	}

	@Override
	public void resize(int arg0, int arg1) {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void show() {
		
	}
	
	public DrawCollection getDrawList() {
		return this.game.rootDraw;
	}
	
	public MouseCollection getMouseList() {
		return this.game.rootMouse;
	}
	
	
}
