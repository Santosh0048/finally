package javaPracticeNew;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetEmployeesByGender {
	public static void main(String[] args) {
		
		ArrayList<Employees> list = new ArrayList<>();
		list.add(new Employees(1, "RAMU", 12000, "M", 25, "ELECTRICAL"));
		list.add(new Employees(2, "AKHIL", 13000, "M", 27, "IRIGATION"));
		list.add(new Employees(3, "CHANDU", 14000, "F", 22, "R&b"));
		list.add(new Employees(4, "RAKESH", 12000, "F", 29, "POLICE"));
		list.add(new Employees(5, "RAJU", 17000, "M", 20, "POLICE"));
		list.add(new Employees(6, "SANTOSH", 16000, "F", 25, "P&R"));
		list.add(new Employees(7, "JAHNAVI", 19000, "F", 22, "IRIGATION"));
		list.add(new Employees(8, "MAYURI", 16000, "M", 28, "ELECTRICAL"));

		//Each Gender total Count
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employees::getGender, Collectors.counting()));
		System.out.println(map);

		//Gender wise Average salary
		Map<String, Double> map1 = list.stream()
				.collect(Collectors.groupingBy(Employees::getGender, Collectors.averagingDouble(Employees::getSalary)));
		System.out.println(map1);

		//Employees age & name
		list.stream().sorted(Comparator.comparing(Employees::getAge))
				.collect(Collectors.toList()).forEach(i->System.out.println("Age "+i.getAge()+" & Name is "+i.getName()));

		//Get all Employees by department wise
		list.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.toList()))
		.entrySet()  //without entry set we can use forEach((i,j)->system.out.println(i.getkey+":"+j.getvalue().....));
		.forEach(i->System.out.println(i.getKey()+" : "+i.getValue().stream().map(Employees::getName).collect(Collectors.joining(", "))));

		//Get Highest salary by department wise
		list.stream()
		.collect(Collectors.groupingBy(Employees::getDepartment, Collectors.maxBy(Comparator.comparing(Employees::getSalary))))
		.entrySet().forEach(i -> i.getValue().ifPresent(emp -> System.out.println(i.getKey() + " : " + emp.getSalary())));
		
		//(i->System.out.println(i.getKey()+" : "+i.getValue().get().getSalary()));//if getValue() empty through NoSuchElement exception

	}
}

class Employees {
	int id;
	String name;
	double salary;
	String gender;
	int age;
	String department;

	public Employees(int id, String name, double salary, String gender, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
