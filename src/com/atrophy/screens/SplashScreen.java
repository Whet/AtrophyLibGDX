package com.atrophy.screens;

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
		
	}

}
