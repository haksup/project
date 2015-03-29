package net.harukusub.project.bowling.inputScore.impl;

import java.util.Scanner;

import net.harukusub.project.bowling.inputScore.InputScore;

public class InputScoreScanner implements InputScore{

	@Override
	public String inputScore(int frameNumber) {
		System.out.print(frameNumber + "프레임 : ");
		Scanner scan = new Scanner(System.in);
        return scan.nextLine();
	}

}
