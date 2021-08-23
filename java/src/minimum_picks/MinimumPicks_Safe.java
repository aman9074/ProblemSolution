import java.util.*;

/**
 * Find the difference between minimum odd and maximum even
 * There is at least one odd and even number in the array
 * 
 * -1e9<A[i]<1e9
 */
public class MinimumPicks_Safe {
    
    public static void main(String[] args) {
        MinimumPicks_Safe minimumPick = new MinimumPicks_Safe();
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");
        String in = scanner.nextLine();
        int[] a = minimumPick.convertStringToIntArray(in.split(" "));
		System.out.println("Difference:"+minimumPick.findDifference(a));
    }

    private int[] convertStringToIntArray(String[] inArr) {
        int[] a = new int[inArr.length];
        for(int i=0; i<inArr.length; i++){
            a[i] = Integer.parseInt(inArr[i]);
        }
        return a;
    }
    
    private int findDifference(int[] A) {
        int minOdd=Integer.MAX_VALUE;
        int maxEven=Integer.MIN_VALUE;
        for(int in:A) {
            if(in%2 == 0) {
                maxEven = Math.max(in,maxEven);
            } else {
                minOdd = Math.min(in,minOdd);
            }
        }
        return maxEven - minOdd;
    }
}
