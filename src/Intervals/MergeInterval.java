package Intervals;

import java.util.Arrays;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        //sort
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int i=0;
        for(int j=1;j<intervals.length;j++){
            int[] curr=intervals[j];
            int[] prev=intervals[i];

            if(curr[0]<=prev[1]){
                prev[1]=Math.max(prev[1],curr[1]);
            }
            else{
                i++;
                intervals[i]=curr;
            }
        }
        return Arrays.copyOf(intervals,i+1);
    }
}
