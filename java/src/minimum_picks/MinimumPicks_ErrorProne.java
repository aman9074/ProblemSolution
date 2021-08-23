import java.util.*;

/**
 * Find the difference between minimum odd and maximum even
 * There is at least one odd and even number in the array
 * 
 * -1e9<A[i]<1e9
 */
public class MinimumPicks_ErrorProne {
    
    public static void main(String[] args) {
        MinimumPicks_ErrorProne minimumPick = new MinimumPicks_ErrorProne();
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

    /** 
     * The method to check odd number is prone to error if abs function is not used.
     * The approach to algorithm should be to use less functions/dependencies.
     * Try running the program with negative odd number in input array without using abs function.
     * [18 9 23 57 -9 1 -24 81 2 50]
    */
    private int findDifference(int[] A) {
        int minOdd=Integer.MAX_VALUE;
        int maxEven=Integer.MIN_VALUE;
        for(int in:A) {
            if(Math.abs(in)%2 == 0) {
                maxEven = Math.max(in,maxEven);
            } else if(Math.abs(in)%2 == 1) {
                minOdd = Math.min(in,minOdd);
            }
        }
        return maxEven - minOdd;
    }
}
