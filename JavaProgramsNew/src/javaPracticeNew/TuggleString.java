package javaPracticeNew;
//HyGFohyj to hYgfOHYJ
public class TuggleString {
	
	public static void main(String[] args) {
		String beforeTuggle="HyG5Fohyj";
		StringBuilder stringBuilder=new StringBuilder();
		char[] array=beforeTuggle.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i]>='A'&&array[i]<='Z') {
				stringBuilder.append((char)(array[i]+32));    //ASCII character code
			} else if (array[i]>='a'&&array[i]<='z') {
				stringBuilder.append((char)(array[i]-32));
			}
		}
		System.out.println(stringBuilder);
	}
}
