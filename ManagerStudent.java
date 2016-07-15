package qlsv;

import java.util.Scanner;

public class ManagerStudent {
	Student[] students;
	int size;

	public ManagerStudent() {
		size = 0;
		students = new Student[100];
		for (int i = 0; i < 100; i++) {
			students[i] = null;
		}
	}

	public int getSize() {
		return size;
	}

	public void listStudents() {
		int i = 0;
		while (i < 100 && students[i] != null) {
			System.out.println(students[i].toString());
			i++;
		}
	}

	public void addStudent(Student s) {
		students[size] = s;
		size++;
	}

	public void deleteStudent(String id) {
		int i = searchById(id);
		if (i > -1 && i < 100) {
			while (students[i + 1] != null) {
				students[i] = students[i + 1];
				i++;
			}
			students[i] = null;
			size--;
			
		}
	}

	public void editStudent(String id) {
		int i = searchById(id);
		Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        students[i].setId(input.nextLine());
        System.out.println("Nhap id: ");
        students[i].setName(input.nextLine());
	}

	private int searchById(String id) {
		for (int i = 0; i < size; i++) {
			if (students[i].id.equals(id))
				return i;
		}
		return -1;
	}
}
