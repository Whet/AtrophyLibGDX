package com.game.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.graphics.WatGame;

public class DesktopLauncher {

	public static void main(String[] args) {
		loadGame(800,600,false);
	}
	
	public static void loadGame(int width, int height, boolean fullscreen) {
		ApplicationListener listener = new WatGame();
		
		String title = "Atrophy";
		
		boolean useOpenGLES2 = false;
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = width;
		config.height = height;
		config.title = title;
		config.useGL20 = useOpenGLES2;
		config.fullscreen = fullscreen;
		
		new LwjglApplication(listener, config);
	}
	
}
