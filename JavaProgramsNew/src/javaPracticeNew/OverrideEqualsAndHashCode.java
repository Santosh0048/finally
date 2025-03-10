package javaPracticeNew;

import java.util.Objects;

public class OverrideEqualsAndHashCode {
	
	public static void main(String[] args) {
		
		String string1=new String("Santosh");        //separate String objects in the heap (not the string pool)
		String string2=new String("Santosh");        //separate String objects in the heap (not the string pool)
		
		System.out.println(string1==string2);        //if both variables refer to the same object in memory
		System.out.println(string1.equals(string2)); //checks if the content is the same, not the reference
		System.out.println(string1.hashCode());      //Hash codes in String are based on content
		System.out.println(string2.hashCode());      //Hash codes in String are based on content
		
		
		string1=string2;
		System.out.println(string1==string2);
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		
		
		Employee employee1=new Employee();            //Employee objects are created in heap memory 
		employee1.setId(1);
		employee1.setName("Santosh");
		
		Employee employee2=new Employee();
		employee2.setId(1);
		employee2.setName("Santosh");
		
		System.out.println(employee1.equals(employee2));//true bcz override in employee class
		System.out.println(employee1==employee2);       //if both variables refer to the same object in memory
		System.out.println(employee1.hashCode());          
		System.out.println(employee2.hashCode());
	}
}
	class Employee {
		
		int id;
		String name;
		double salary;
		String gender;
		int age;
		String department;
		
		
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

		@Override
		public boolean equals(Object obj) {
		    if (this == obj) 
		    	return true;
		    if (obj == null || getClass() != obj.getClass()) 
		    	return false;
		    Employee employee = (Employee) obj;
		    return id == employee.id && Objects.equals(name, employee.name);//equals method on name 
		}

		@Override
		public int hashCode() {
		    return Objects.hash(id, name);
		}
	}
