package javaPracticeNew;

public class MissingNumber {
	public static void main(String[] args) {
		int num[]= {1,2,3,5};
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		int sum1=0;
		for (int i = num[0]; i <=num[num.length-1]; i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println("Missing Number is : "+String.valueOf(sum1-sum));
	}
}
