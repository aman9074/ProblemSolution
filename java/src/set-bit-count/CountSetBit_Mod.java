import java.util.Scanner;

public class CountSetBit_Mod {

	public static void main(String[] args) {
		CountSetBit_Mod countSetBit = new CountSetBit_Mod();
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");
		System.out.println("Output:"+countSetBit.numSetBits(scanner.nextInt()));
	}

	public int numSetBits(int A) {
		int countOne = 0;
        while(A>0) {
            int rem = A%2;
            countOne = rem==1 ? ++countOne : countOne;
            A=A/2;
            System.out.println("Remainder:"+A);
            System.out.println("OneCount:"+countOne);
        }
        return countOne;
    }
}
