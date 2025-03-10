package javaPracticeNew;

public class PassByValueExample {
	public static void main(String[] args) {
		int x=10;
		System.out.println("before calling Change Method "+x);// Prints 10
		changeMethod(x);                                      // Passing x (a copy is sent)
		System.out.println("before calling Change Method "+x);// Still prints 10
	}

	private static void changeMethod(int x) {  // x is a COPY of the original value
		x=20;                                  // This changes only the copy, NOT the original variable in main()
		
	}

}
