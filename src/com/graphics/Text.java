package com.graphics;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Text implements Displayable {

	private BitmapFont font;
	private CharSequence text;
	private int x, y;

	public Text(BitmapFont font) {
		this.font = font;
		this.x = 0;
		this.y  = 0;
	}
	
	public BitmapFont getFont() {
		return font;
	}

	public void setFont(BitmapFont font) {
		this.font = font;
	}

	public CharSequence getText() {
		return text;
	}

	public void setText(CharSequence text) {
		this.text = text;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw(SpriteBatch spriteBatch, float stateTime) {
		
		this.font.draw(spriteBatch, this.text, this.x, this.y);
	
	}

}
