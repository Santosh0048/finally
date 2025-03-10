package javaPracticeNew;

public class ReverseAString {
	public static void main(String[] args) {
		String string="Hello";
		String stringBuffer=new StringBuffer(string).reverse().toString();
		System.out.println(stringBuffer);
	}

}
