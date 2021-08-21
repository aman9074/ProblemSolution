import java.util.Scanner;

public class CountSetBit_BitManipulation {

	public static void main(String[] args) {
		CountSetBit_BitManipulation countSetBit = new CountSetBit_BitManipulation();
        System.out.print("Input:");
		Scanner scanner = new Scanner(System.in);
		System.out.println(countSetBit.numSetBits(scanner.nextInt()));
	}

	public int numSetBits(long A) {
        int totalOnes = 0;
        while (A != 0) {
            A = A & (A - 1);
            System.out.println("Rem:"+A);
            totalOnes++;
            System.out.println("OneCount:"+totalOnes);
        }
        return totalOnes;
    }
}
