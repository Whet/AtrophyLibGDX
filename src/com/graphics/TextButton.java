package com.graphics;

import com.actions.MouseRegion;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds;

public class TextButton {

	private MouseRegion hitbox;
	private Text text;
	
	public TextButton(BitmapFont font, int x, int y) {
		this.text = new Text(font);
		
		TextBounds dimensions = text.getFont().getBounds(text.getText());
		
		this.hitbox = new MouseRegion(x, y, (int)dimensions.width, (int)dimensions.height) {
			
			@Override
			public boolean mD(int x, int y) {
				return mouseDown(x, y);
			}
			
			@Override
			public boolean mU(int x, int y) {
				return mouseUp(x, y);
			}
			
			@Override
			public void mI(int x, int y) {
				mouseIn();
			}
			
			@Override
			public void mO(int x, int y) {
				mouseOut();
			}
			
		};
	}
	
	protected boolean mouseDown(int x, int y) {
		return false;
	}
	
	protected boolean mouseUp(int x, int y) {
		return false;
	}
	
	protected boolean mouseIn() {
		return false;
	}
	
	protected boolean mouseOut() {
		return false;
	}

	public MouseRegion getHitbox() {
		return hitbox;
	}

	public Text getText() {
		return text;
	}
	
	public void setText(CharSequence text) {
		this.text.setText(text);
		
		TextBounds dimensions = this.text.getFont().getBounds(this.text.getText());
		
		this.hitbox.setWidth((int) dimensions.width);
		this.hitbox.setHeight((int) dimensions.height * 2);
		this.hitbox.setX(this.text.getX());
		this.hitbox.setY(this.text.getY() - (int)dimensions.height);
	}
	
	public void setX(int x) {
		this.text.setX(x);
		this.hitbox.setX(this.text.getX());
	}
	
	public void setY(int y) {
		this.text.setY(y);
		TextBounds dimensions = this.text.getFont().getBounds(this.text.getText());
		this.hitbox.setY(this.text.getY() - (int)dimensions.height);
	}
	
}
