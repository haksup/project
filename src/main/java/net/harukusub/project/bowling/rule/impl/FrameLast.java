package net.harukusub.project.bowling.rule.impl;

import net.harukusub.project.bowling.rule.Frame;
import net.harukusub.project.bowling.rule.InputScore;

public class FrameLast implements Frame{

	@Override
	public String[] frame(InputScore inputScore, int frameNumber) {
		String[] frameScore = new String[2];
		for(int i = 0; i < 3; i++){	// 마지막 프레임(10번)이면 최대 세번까지 던질 수 있다.
			frameScore[i] = inputScore.inputScore(frameNumber);
		}
		return frameScore;
		
	}

}
