import Intervals.MergeInterval;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10}, {15,18}};
        int[][] output=MergeInterval.merge(intervals);
        System.out.println(Arrays.deepToString(output));
    }
}