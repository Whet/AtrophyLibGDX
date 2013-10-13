package com.actions;

import com.badlogic.gdx.math.Rectangle;

public class MouseRegion implements MouseRespondable {

	private Rectangle hitbox;
	
	public MouseRegion(int x, int y, int width, int height) {
		hitbox = new Rectangle(x, y, width, height);
	}
	
	@Override
	public boolean isInBounds(int x, int y) {
		return hitbox.contains(x, y);
	}
	
	@Override
	public boolean mU(int x, int y) {
		return false;
	}

	@Override
	public boolean mD(int x, int y) {
		return false;
	}

}
