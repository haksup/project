package net.harukusub.project.bowling.inputData.impl;

import java.util.List;

import net.harukusub.project.bowling.frameManage.Frame;
import net.harukusub.project.bowling.frameManage.impl.BaseFrame;
import net.harukusub.project.bowling.frameManage.impl.Four;
import net.harukusub.project.bowling.frameManage.impl.Gutter;
import net.harukusub.project.bowling.frameManage.impl.Spare;
import net.harukusub.project.bowling.frameManage.impl.Strike;
import net.harukusub.project.bowling.frameManage.impl.Zero;
import net.harukusub.project.bowling.inputData.InputData;

public class InputDataImpl implements InputData {
	
	@Override
	public List<String> inputPrintData(int rollNumber, String breakPins, 
			List<String> printScoreArray) {
		inputPrintConform(rollNumber, breakPins);
		return null;
	}

	@Override
	public List<Integer> inputScoreData(int rollNumber, String breakPins, List<Integer> scoreArray) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 정리중
	private void inputPrintConform(int rollNumber, String breakPins){
		Frame frame;
		if(isFoul(breakPins))
			frame = new Four();
		else if(isGutter(breakPins))
			frame = new Gutter();
		else if(isZero(breakPins))
			frame = new Zero();
		else if(isStrike(rollNumber, breakPins))
			frame = new Strike();
		else if(isSpare(rollNumber, breakPins))
			frame = new Spare();
		else
			frame = new BaseFrame();
	}
	
	// roll 결과(S)
	private boolean isSpare(int rollNumber, String breakPins)
			throws NumberFormatException {
		return rollNumber == 1 && scoreStore[this.scoreSavePoint - 1] + Integer.parseInt(breakPins) == 10;
	}

	private boolean isStrike(int rollNumber, String breakPins) {
		return rollNumber == 0 && breakPins.equals("10");
	}
	
	private boolean isZero(String breakPins) {
		return breakPins.equals("0");
	}
	
	private boolean isGutter(String breakPins) {
		return breakPins.equals("G");
	}

	private boolean isFoul(String breakPins) {
		return breakPins.equals("F");
	}
	// roll 결과(E)
	
}
