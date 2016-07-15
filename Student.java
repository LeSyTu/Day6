package qlsv;

public class Student {
	String name;
	String id;

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		String result = id + " " + name;
		return result;
	}
	
	public static void main(String[] args) {
		String name = "Nguyen Van An";
		String id = "123";
		
		Student a = new Student(name, id);
		System.out.print(a.toString());
	}
}
