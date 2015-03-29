package net.harukusub.project.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.harukusub.project.bowling.inputData.InputData;
import net.harukusub.project.bowling.inputData.impl.InputDataImpl;

public class BowlingGame {
	private List<String> printScoreArray = new ArrayList<>();
	private List<Integer> scoreArray = new ArrayList<>();
	
	public void play(){
		InputData inputData = new InputDataImpl();
		
		for(int frameNumber = 1; frameNumber <= 10; frameNumber++){
			String score = inputScore(frameNumber);
			
		}
	}
	
	public String inputScore(int frameNumber) {
		System.out.print(frameNumber + "프레임 : ");
		Scanner scan = new Scanner(System.in);
        return scan.nextLine();
	}

//	private void frameRoll(int frameRollCount) {
//		InputScore inputScore = new InputScoreScanner();
//		for(int rollCount = 0; rollCount < frameRollCount; rollCount++){
//			String score = inputScore.inputScore(this.frameNumber);
//
//			if(isFoul(score)){
//				inputData("F", 0);
//			}
//			else if(isGutter(score)){
//				inputData("G", 0);
//			}
//			else if(isZero(score)){
//				inputData("-", 0);
//			}
//			else if(isStrike(rollCount, score)){
//				inputData("X", 10);
//				this.printScoreStore[++this.printScoreSavePoint] = "";
//				this.printScoreSavePoint++;
//				this.scoreSavePoint++;
//				break;
//			}
//			else if(isSpare(rollCount, score)){
//				inputData("/", Integer.parseInt(score));
//			}
//			else{
//				inputData(score, Integer.parseInt(score));
//			}
//			this.printScoreSavePoint++;
//			this.scoreSavePoint++;
//		}
//		print();
//	}

//	private void inputData(String printCharacter, int inputData) {
//		this.printScoreStore[this.printScoreSavePoint] = printCharacter; 
//		this.scoreStore[this.scoreSavePoint] = inputData;
//	}
//	
//	private void print(){
//		for(String str : this.printScoreStore){
//			System.out.print(str + " ");
//		}
//		System.out.println();
//		for(int str : this.scoreStore){
//			System.out.print(str + " ");
//		}
//	}

	// roll 결과(S)
//	private boolean isSpare(int rollCount, String score)
//			throws NumberFormatException {
//		return rollCount == 1 && scoreStore[this.scoreSavePoint - 1] + Integer.parseInt(score) == 10;
//	}
//
//	private boolean isStrike(int rollCount, String score) {
//		return rollCount == 0 && score.equals("10");
//	}
//	
//	private boolean isZero(String score) {
//		return score.equals("0");
//	}
//	
//	private boolean isGutter(String score) {
//		return score.equals("G");
//	}
//
//	private boolean isFoul(String score) {
//		return score.equals("F");
//	}
	// roll 결과(E)

	
	
}
