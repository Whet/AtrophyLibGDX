package com.atrophy.screens;

import com.atrophy.graphics.DefaultTextButton;
import com.badlogic.gdx.Gdx;
import com.graphics.SingleImage;
import com.graphics.WatGame;
import com.graphics.WatScreen;

public class SplashScreen extends WatScreen {

	public SplashScreen(WatGame game) {
		super(game);
		
		addComponents();
	}

	private void addComponents() {

		SingleImage image = new SingleImage("FileData/images/atrophy/menu/background.png");
		image.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		this.getDrawList().addDisplayable(image);
		
		DefaultTextButton startGameBtn = new DefaultTextButton(200, 200) {
			
			@Override
			protected boolean mouseDown(int x, int y) {
				game.setScreen(new CharacterCreateScreen(game));
				return super.mouseDown(x, y);
			}
		
		};
		this.getDrawList().addDisplayable(startGameBtn.getText());
		this.getMouseList().addRespondable(startGameBtn.getHitbox());
		startGameBtn.setText("New Game");
		startGameBtn.setX(40);
		startGameBtn.setY(Gdx.graphics.getHeight() - 100);
		
		DefaultTextButton loadGameBtn = new DefaultTextButton(200, 200) {
			
			@Override
			protected boolean mouseDown(int x, int y) {
				System.out.println("Load game");
				return super.mouseDown(x, y);
			}
		
		};
		this.getDrawList().addDisplayable(loadGameBtn.getText());
		this.getMouseList().addRespondable(loadGameBtn.getHitbox());
		loadGameBtn.setText("Load Game");
		loadGameBtn.setX(40);
		loadGameBtn.setY(Gdx.graphics.getHeight() - 200);
		
	}

}
