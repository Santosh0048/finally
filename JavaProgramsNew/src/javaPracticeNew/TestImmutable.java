package javaPracticeNew;

public class TestImmutable {
	public static void main(String[] args) {
		Degree degree = new Degree("Bcom", "KU");
		ImmutableClass obj = new ImmutableClass(26, 101, "rakesh", degree);
		System.out.println(obj.getAge());
		System.out.println(obj.getDegree().getCourse());
		degree = new Degree("MCA", "OU"); // This does not change ImmutableClass's degree
        System.out.println("After modification: " + obj.getDegree().getCourse());

	}
}
