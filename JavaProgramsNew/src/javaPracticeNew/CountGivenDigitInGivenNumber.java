package javaPracticeNew;

import java.util.Scanner;

public class CountGivenDigitInGivenNumber {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter number...");
			long number=scanner.nextLong();
			System.out.println("enter digit...");
			int digit=scanner.nextInt();
			int count=getCountOfDigitInNumber(number,digit);
			System.out.println("count of given digit "+digit+" in given number "+number+" is "+count);
		}
	}

	private static int getCountOfDigitInNumber(long number, int digit) {
		int count = 0;
		long temp;
		while(number!=0) {
			temp=number%10; //give last digit of number
			if(temp==digit) {
				count++;
			}
			number=number/10; //removes the last digit
		}
		
		return count;
	}
}
