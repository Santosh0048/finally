package javaPracticeNew;

public class ReverseWords {
	public static void main(String[] args) {
		String sentence="Hi my name is Santosh";
		System.out.println(new StringBuffer(sentence).reverse().toString());
		String[] stringArray=sentence.split(" ");
		StringBuffer stringBuffer=new StringBuffer();
		for (int i = stringArray.length-1; i >=0 ; i--) {
			stringBuffer.append(stringArray[i]);
			if(i!=0)
				stringBuffer.append(" ");
		}
		System.out.println(stringBuffer);
	}

}
