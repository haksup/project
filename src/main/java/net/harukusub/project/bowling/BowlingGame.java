package net.harukusub.project.bowling;

import net.harukusub.project.bowling.rule.Frame;
import net.harukusub.project.bowling.rule.InputScore;
import net.harukusub.project.bowling.rule.impl.FrameBase;
import net.harukusub.project.bowling.rule.impl.FrameLast;
import net.harukusub.project.bowling.rule.impl.InputScoreScanner;

public class BowlingGame {
	public void play(){
		Frame frame;
		InputScore inputScore = new InputScoreScanner();
		String score;
		
		for(int i = 1; i<=10; i++){
			score = inputScore.inputScore(i);
			if(i < 10){
				frame = new FrameBase();
			}
			else{
				frame = new FrameLast();
			}
			frame.frame();
		}
	}
	
}
