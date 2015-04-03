package net.harukusub.project.bowling.frameManage.impl;

import net.harukusub.project.bowling.frameManage.Frame;

public class BaseFrame implements Frame{
	private String breakPins;
	
	public BaseFrame(String breakPins){
		this.breakPins = breakPins;
	}
	
	@Override
	public String printData() {
		return this.breakPins;
	}

}
