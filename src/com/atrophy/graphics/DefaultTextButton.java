package com.atrophy.graphics;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.graphics.TextButton;

public class DefaultTextButton extends TextButton {

	private static final Color ON_COLOUR = new Color(100,0,0,255);
	private static final Color OFF_COLOUR = new Color(180,180,60,255);
	
	public DefaultTextButton(BitmapFont font, int x, int y) {
		super(font, x, y);
		this.getText().setColour(OFF_COLOUR);
	}
	
	public DefaultTextButton(int x, int y) {
		super(Fonts.FONT_18, x, y);
		this.getText().setColour(OFF_COLOUR);
	}
	
	@Override
	protected boolean mouseIn() {
		this.getText().setColour(ON_COLOUR);
		return true;
	}
	
	@Override
	protected boolean mouseOut() {
		this.getText().setColour(OFF_COLOUR);
		return false;
	}
	
}
