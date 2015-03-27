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
				String printCharacter = "F";
				int inputData = 0;
				inputData(printCharacter, inputData);
			}
			else if(isGutter(score)){
				String printCharacter = "-";
				int inputData = 0;
				inputData(printCharacter, inputData);
			}
			else if(isStrike(rollCount, score)){
				String printCharacter = "X";
				int inputData = 10;
				inputData(printCharacter, inputData);
				this.printScoreStore[++this.printScoreSavePoint] = "";
				this.printScoreSavePoint++;
				this.scoreSavePoint++;
				break;
			}
			else if(isSpare(rollCount, score)){
				String printCharacter = "/";
				int inputData = Integer.parseInt(score);
				inputData(printCharacter, inputData);
			}
			else{
				String printCharacter = score;
				int inputData = Integer.parseInt(score);
				inputData(printCharacter, inputData);
			}
			this.printScoreSavePoint++;
			this.scoreSavePoint++;
		}
		print();
	}

	private void inputData(String printCharacter, int inputData) {
		this.printScoreStore[this.printScoreSavePoint] = printCharacter; 
		this.scoreStore[this.scoreSavePoint] = inputData;
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
