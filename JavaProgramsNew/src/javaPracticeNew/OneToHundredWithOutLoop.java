package javaPracticeNew;

public class OneToHundredWithOutLoop {
	public static void main(String[] args) {
		printNumbers(1);
	}

	private static void printNumbers(int i) {
		if (i<=100) {
			System.out.println(i);
			printNumbers(i+1);  //recursion
		}
		
	}

}
