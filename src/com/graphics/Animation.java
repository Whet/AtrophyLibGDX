package com.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animation implements Displayable {

	private com.badlogic.gdx.graphics.g2d.Animation animation;
	private int x, y;

	public Animation(String file, int x, int y, int xStep, int yStep, int width, int height, int frames, float frameTime) {
		
		Texture spriteSheet = new Texture(Gdx.files.internal(file));
        
        TextureRegion[] textureRegionArray = new TextureRegion[frames];
        
        int anX = x;
        int anY = y;
        
        for(int i = 0; i < textureRegionArray.length; i++) {
        	textureRegionArray[i] = new TextureRegion(spriteSheet, anX, anY, width, height);
        	anX += xStep;
        	anY += yStep;
        }
        
        animation = new com.badlogic.gdx.graphics.g2d.Animation(frameTime, textureRegionArray);
		
        this.x = 0;
        this.y = 0;
	}
	
	public Animation(String file, int x, int y, int xStep, int yStep, int width, int height, int frames, float frameTime, boolean loopAnimation) {
		
		Texture spriteSheet = new Texture(Gdx.files.internal(file));
        
        TextureRegion[] textureRegionArray;
        
        if(loopAnimation)
        	textureRegionArray = new TextureRegion[frames * 2 - 2];
        else
        	textureRegionArray = new TextureRegion[frames];
        
        int anX = x;
        int anY = y;
        if(loopAnimation) {
        	for(int i = 0; i < frames; i++) {
	        	textureRegionArray[i] = new TextureRegion(spriteSheet, anX, anY, width, height);
	        	anX += xStep;
	        	anY += yStep;
	        }
        	for(int i = 0; i < frames - 2; i++) {
	        	textureRegionArray[frames + i] = textureRegionArray[frames - i - 2];
	        }
        }
        else {
	        for(int i = 0; i < textureRegionArray.length; i++) {
	        	textureRegionArray[i] = new TextureRegion(spriteSheet, anX, anY, width, height);
	        	anX += xStep;
	        	anY += yStep;
	        }
        }
        
        animation = new com.badlogic.gdx.graphics.g2d.Animation(frameTime, textureRegionArray);
		
        this.x = 0;
        this.y = 0;
	}

	@Override
	public void draw(SpriteBatch spriteBatch, float stateTime) {
		spriteBatch.draw(animation.getKeyFrame(stateTime, true), this.x, this.y);
	}
	
}
