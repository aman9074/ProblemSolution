import java.util.Scanner;

/**
 * XORing two equal numbers cancel each other, thereby leaving non-duplicate number in the output
 */
public class FindNonDuplicateNumber_BitManipulation {
    public static void main(String[] args) {
		FindNonDuplicateNumber_BitManipulation nonDuplicate = new FindNonDuplicateNumber_BitManipulation();
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");
        String in = scanner.nextLine();
        int[] a = nonDuplicate.convertStringToIntArray(in.split(" "));
		System.out.println("Non duplicate number:"+nonDuplicate.findNonDuplicate(a));
	}

    private int[] convertStringToIntArray(String[] inArr) {
        int[] a = new int[inArr.length];
        for(int i=0; i<inArr.length; i++){
            a[i] = Integer.parseInt(inArr[i]);
        }
        return a;
    }

	public int findNonDuplicate(int A[]) {
        int out = 0;
        for(int i=0; i<A.length; i++) {
            out = out ^ A[i];
            System.out.println("Intermediate xor output:"+out);
        }
        return out;
    }
}
