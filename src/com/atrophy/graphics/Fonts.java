package com.atrophy.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class Fonts {

	public static BitmapFont FONT_12, FONT_18, FONT_24;
	
	public static void loadFonts() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("FileData/fonts/AUDIMO__.TTF"));
		FONT_12 = generator.generateFont(15);
		FONT_18 = generator.generateFont(18);
		FONT_24 = generator.generateFont(24);
	}
	
}
