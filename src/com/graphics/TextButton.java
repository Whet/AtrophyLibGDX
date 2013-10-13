package com.graphics;

import com.actions.MouseRegion;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class TextButton {

	private MouseRegion hitbox;
	private Text text;
	
	public TextButton(BitmapFont font, int x, int y, int width, int height) {
		this.text = new Text(font);
		this.hitbox = new MouseRegion(x, y, width, height) {
			
			@Override
			public boolean mD(int x, int y) {
				return mouseDown(x, y);
			}
			
			@Override
			public boolean mU(int x, int y) {
				return mouseUp(x, y);
			}
			
		};
	}
	
	protected boolean mouseDown(int x, int y) {
		return false;
	}
	
	protected boolean mouseUp(int x, int y) {
		return false;
	}

	public MouseRegion getHitbox() {
		return hitbox;
	}

	public Text getText() {
		return text;
	}
	
}
