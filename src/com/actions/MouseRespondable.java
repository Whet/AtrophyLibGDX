package com.actions;

public interface MouseRespondable {

	public boolean mU(int x, int y);
	
	public boolean mD(int x, int y);
	
	public void mI(int x, int y);
	
	public void mO(int x, int y);

	boolean isInBounds(int x, int y);

}
