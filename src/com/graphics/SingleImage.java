package com.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SingleImage implements Displayable {

	private Texture image;
	private int x, y;
	private int widthModifier, heightModifier;

	public SingleImage(String file) {
		this.x = 0;
		this.y = 0;
		
		image = new Texture(Gdx.files.internal(file));
		
		this.widthModifier = image.getWidth();
		this.heightModifier = image.getHeight();
	}
	
	@Override
	public void draw(SpriteBatch spriteBatch, float stateTime) {

		spriteBatch.draw(image, x, y, widthModifier, heightModifier);
		
	}

	public void setSize(int width, int height) {
		this.widthModifier = width;
		this.heightModifier = height;
	}

}
