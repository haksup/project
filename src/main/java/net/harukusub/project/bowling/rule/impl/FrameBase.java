package net.harukusub.project.bowling.rule.impl;

import net.harukusub.project.bowling.rule.Frame;
import net.harukusub.project.bowling.rule.InputScore;

public class FrameBase implements Frame{

	@Override
	public String[] frame(InputScore inputScore, int frameNumber) {
		String[] frameScore = new String[2];
		for(int i = 0; i < 2; i++){	// 최대 두번까지 던질 수 있다.
			frameScore[i] = inputScore.inputScore(frameNumber);
		}
		return frameScore;
	}

}
