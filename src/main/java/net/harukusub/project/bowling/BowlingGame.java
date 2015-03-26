package net.harukusub.project.bowling;

import net.harukusub.project.bowling.rule.InputScore;
import net.harukusub.project.bowling.rule.impl.InputScoreScanner;

public class BowlingGame {
	private int frameNumber = 1;
	private String[] printScoreStore = new String[21];
	private int[] scoreStore = new int[21];
	private int printScoreSavePoint = 0;
	private int scoreSavePoint = 0;
	
	public void play(){
		for(int frameNumber = 1; frameNumber <= 10; frameNumber++){
			this.frameNumber = frameNumber;
			int frameRollCount = 2;
			if(isLastFrame(frameNumber))
				frameRollCount = 3;
			
			frameRoll(frameRollCount);
		}
		
	}

	private void frameRoll(int frameRollCount) {
		InputScore inputScore = new InputScoreScanner();
		for(int rollCount = 0; rollCount < frameRollCount; rollCount++){
			String score = inputScore.inputScore(this.frameNumber);

			if(isFoul(score)){
				this.printScoreStore[this.printScoreSavePoint] = "F"; 
				this.scoreStore[this.scoreSavePoint] = 0;
			}
			else if(isGutter(score)){
				this.printScoreStore[this.printScoreSavePoint] = "-"; 
				this.scoreStore[this.scoreSavePoint] = 0;
			}
			else if(isStrike(rollCount, score)){
				this.printScoreStore[this.printScoreSavePoint] = "X"; 
				this.scoreStore[this.scoreSavePoint] = 10;
				this.printScoreStore[++this.printScoreSavePoint] = "a";
				this.printScoreSavePoint++;
				this.scoreSavePoint++;
				break;
			}
			else if(isSpare(rollCount, score)){
				this.printScoreStore[this.printScoreSavePoint] = "/"; 
				this.scoreStore[this.scoreSavePoint] = Integer.parseInt(score);
			}
			else{
				this.printScoreStore[this.printScoreSavePoint] = score; 
				this.scoreStore[this.scoreSavePoint] = Integer.parseInt(score);
			}
			this.printScoreSavePoint++;
			this.scoreSavePoint++;
		}
		print();
	}
	
	private void print(){
		for(String str : this.printScoreStore){
			System.out.print(str + " ");
		}
		System.out.println();
		for(int str : this.scoreStore){
			System.out.print(str + " ");
		}
	}

	private boolean isSpare(int rollCount, String score)
			throws NumberFormatException {
		return rollCount == 1 && scoreStore[this.scoreSavePoint - 1] + Integer.parseInt(score) == 10;
	}

	private boolean isStrike(int rollCount, String score) {
		return rollCount == 0 && score.equals("10");
	}

	private boolean isGutter(String score) {
		return score.equals("G");
	}

	private boolean isFoul(String score) {
		return score.equals("F");
	}

	private boolean isLastFrame(int i) {
		return i == 10;
	}
	
}
