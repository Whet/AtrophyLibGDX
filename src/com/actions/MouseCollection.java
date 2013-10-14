package com.actions;

import java.util.ArrayList;
import java.util.List;

public class MouseCollection implements MouseRespondable {

	private List<MouseRespondable> actionList;
	
	public MouseCollection() {
		this.actionList = new ArrayList<>();
	}
	
	public void addRespondable(MouseRespondable respondable) {
		this.actionList.add(respondable);
	}

	@Override
	public boolean mU(int x, int y) {
		for(MouseRespondable mouseRespondable: this.actionList) {
			if(mouseRespondable.isInBounds(x, y) && mouseRespondable.mU(x, y))
				return true;
		}
		return false;
	}

	@Override
	public boolean mD(int x, int y) {
		for(MouseRespondable mouseRespondable: this.actionList) {
			if(mouseRespondable.isInBounds(x, y) && mouseRespondable.mD(x, y))
				return true;
		}
		return false;
	}

	@Override
	public boolean isInBounds(int x, int y) {
		return true;
	}

	@Override
	public void mI(int x, int y) {
		for(MouseRespondable mouseRespondable: this.actionList) {
			if(mouseRespondable.isInBounds(x, y))
				mouseRespondable.mI(x, y);
		}
	}

	@Override
	public void mO(int x, int y) {
		for(MouseRespondable mouseRespondable: this.actionList) {
			if(!mouseRespondable.isInBounds(x, y))
				mouseRespondable.mO(x, y);
		}
	}
	
}
