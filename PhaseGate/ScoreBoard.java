// ScoreBoard.java

import java.util.Arrays;
public class ScoreBoard {
    public static int[] totalScores(int[][] scores) {
        int[] totals = new int[scores.length];
        for (int row = 0; row < scores.length; row++) {
            for (int column = 0; column < scores[row].length; column++) {
                totals[row] += scores[row][column];
            }
        }
        return totals;
    }



public static int[] averageScores(int[][] scores) {
 int average = 0;
 int[] totals = new int[totalScores(scores)];
 for(int counter = 0; counter < scores.length; counter++) {
      average[counter] = totals[average] /
   















}