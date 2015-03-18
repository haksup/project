package net.harukusub.project.bowling;

import net.harukusub.project.bowling.rule.InputScore;
import net.harukusub.project.bowling.rule.impl.InputScoreScanner;

public class BowlingPlay {

	public static void main(String args[]){
		InputScore inputScore = new InputScoreScanner();
		System.out.print("데이터 : ");
		String str = inputScore.inputScore();
		System.out.println(str);
	}
}
