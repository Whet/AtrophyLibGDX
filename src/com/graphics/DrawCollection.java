package com.graphics;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DrawCollection implements Displayable {

	private List<Displayable> displayList;
	
	public DrawCollection() {
		this.displayList = new ArrayList<>();
	}
	
	@Override
	public void draw(SpriteBatch spriteBatch, float stateTime) {
		for(Displayable displayable: this.displayList) {
			displayable.draw(spriteBatch, stateTime);
		}
	}
	
	public void addDisplayable(Displayable displayable) {
		this.displayList.add(displayable);
	}

}
