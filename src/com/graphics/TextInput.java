package com.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.TextInputListener;

public class TextInput implements TextInputListener {

	private String title;
	private String text;
	
	public TextInput(String title, String defaultText) {
		this.title = title;
		this.text = defaultText;
	}

	@Override
	public void canceled() {
		
	}

	@Override
	public void input(String string) {
		this.text = string;
	}

	public void showInput() {
		Gdx.input.getTextInput(this, title, text);
	}
	
}
