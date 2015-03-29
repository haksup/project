package net.harukusub.project.bowling.inputData.impl;

import java.util.List;
import java.util.Scanner;

import net.harukusub.project.bowling.inputData.InputData;

public class InputDataImpl implements InputData {

	@Override
	public void inputData(int frameNumber, List<String> printScoreArray,
			List<Integer> scoreArray) {
		int frameRollCount = howRollCount(frameNumber);
		
		for(int rollCount = 0; rollCount < frameRollCount; rollCount++){
			
		}
	}

	private int howRollCount(int frameNumber) {
		int frameRollCount = 2;
		if(isLastFrame(frameNumber))	// 마지막 프레임은 최대 3번의 플레이가 가능하다.
			frameRollCount = 3;
		return frameRollCount;
	}
	
	private boolean isLastFrame(int i) {
		return i == 10;
	}
	
	

}
