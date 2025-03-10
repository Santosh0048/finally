package javaPracticeNew;

import java.util.Scanner;

public class FibbinacciSeriesOfNth {
	//0 1 1 2 3 5 8......
	//Adding First two Numbers
	public static void main(String[] args) {
		long first = 0 ,second = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Nth Number : ");
		int nth = scanner.nextInt();
		if (nth <= 0) {
			System.out.println("Number cant be zero or negative");

		} else if (nth == 1) {
			System.out.println(nth+" Fibbinacci in order is "+first);
		} else if (nth == 2) {
			System.out.println(nth+" Fibbinacci in order is "+second);
		} else {
			long current=0;
			for (int i = 3; i <=nth; i++) {
				current=first + second;
				first=second;
				second=current;
			}
			System.out.println(nth+"th Fibbinacci in order is "+current);
		}
	}
}
