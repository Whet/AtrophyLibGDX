package com.atrophy.screens;

import com.badlogic.gdx.Gdx;
import com.graphics.SingleImage;
import com.graphics.WatGame;
import com.graphics.WatScreen;

public class CharacterCreateScreen extends WatScreen {

	public CharacterCreateScreen(WatGame game) {
		super(game);
		
		this.addComponents();
	}

	private void addComponents() {
		SingleImage image = new SingleImage("FileData/images/atrophy/menu/background.png");
		image.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		this.getDrawList().addDisplayable(image);		
	}

}
