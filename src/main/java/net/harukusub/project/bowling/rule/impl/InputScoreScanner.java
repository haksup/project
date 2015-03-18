package net.harukusub.project.bowling.rule.impl;

import java.util.Scanner;

import net.harukusub.project.bowling.rule.InputScore;

public class InputScoreScanner implements InputScore{

	@Override
	public String inputScore(int i) {
		System.out.print(i + "프레임 : ");
		Scanner scan = new Scanner(System.in);
        return scan.nextLine();
	}

}
