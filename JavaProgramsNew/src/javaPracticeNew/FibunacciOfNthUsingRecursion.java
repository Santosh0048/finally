package javaPracticeNew;

public class FibunacciOfNthUsingRecursion {
	public static void main(String[] args) {
		int num = 9;// 0,1,2,3,5,8,13,21,34......
		int fibunacci = findFibunacci(num);
		System.out.println(fibunacci+",");
	}

	private static int findFibunacci(int num) {
		if (num <= 1) {
			return num;
		} else {
			return findFibunacci(num - 1) + findFibunacci(num - 2);
		}
	}

}
