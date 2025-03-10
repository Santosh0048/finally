package javaPracticeNew;

/*
 * class should be final to prevent inheritance
 * variable should be private and final
 * inject values with constructor
 * add only getter methods to retrieve data
 * over ride toString method
 */
public final class ImmutableClass {

	private final int age;
	private final int id;
	private final String name;
	private final Degree degree;

	public ImmutableClass(int age, int id, String name, Degree degree) {
		this.age = age;
		this.id = id;
		this.name = name;
		this.degree = new Degree(degree.getCourse(), degree.getUniversity()); //Creating a new object to maintain immutabilityi.e copy of object
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	Returning a new Degree instance to maintain immutability
	public Degree getDegree() {
		return new Degree(degree.getCourse(), degree.getUniversity());
	}

	@Override
	public String toString() {

		return "ImmutableClass[age=" + age + ",id=" + id + ",name=" + name + ",degree=" + degree + "]";

//		return String.format("ImmutableClass{id=%d, name='%s'}", id, name);

		/* return new StringBuilder("ImmutableClass{id=")
		.append(id)
		.append(", name='")
		.append(name)
		.append("'}")
		.toString();*/

	}

	public static void main(String[] args) {
		Degree degree = new Degree("Bcom", "KU");
		ImmutableClass obj = new ImmutableClass(26, 101, "rakesh", degree);
		System.out.println(obj);

	}

}
