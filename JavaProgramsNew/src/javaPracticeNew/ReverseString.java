package javaPracticeNew;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string...");
		String value=scanner.nextLine();
		String reverseValue=getReverseString(value);
		System.out.println("reverse String of "+value+" is "+reverseValue);
		if (value.equals(reverseValue)) {
			System.out.println("given string is polindrom");
		} else {
			System.out.println("given string is NOT a polindrom");
		}
		scanner.close();
	}

	private static String getReverseString(String value) {
		StringBuffer stringBuffer=new StringBuffer();
		for (int i = value.length()-1; i >=0; i--) {
			stringBuffer.append(value.charAt(i));
		}
		return stringBuffer.toString();
	}
}
