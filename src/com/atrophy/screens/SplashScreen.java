package com.atrophy.screens;

import java.io.File;

import com.atrophy.graphics.Fonts;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.graphics.SingleImage;
import com.graphics.Text;
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
		
		Text text = new Text(Fonts.FONT_24);
		text.setText("Test");
		text.setX(300);
		text.setY(500);
		this.getDrawList().addDisplayable(text);
		
	}

}
