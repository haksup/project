package net.harukusub.project.bowling.inputData;

import java.util.List;

public interface InputData {
	public List<String> inputPrintData(int rollNumber, String breakPins, List<String> printScoreArray,List<Integer> scoreArray);
	public List<Integer> inputScoreData(int rollNumber, String breakPins, List<Integer> scoreArray);
}
