package qlsv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ManagerStudent manager = new ManagerStudent();
		int function = -1;
		while (function != 0) {
			System.out.println(
					"Choose function:\n1: list student\n2: add student\n3: delete student\n4: edit student\n0: exit");
			function = input.nextInt();

			switch (function) {
			case 1:
				manager.listStudents();
				break;

			case 2: {
				String name, id;
				Student s;
				System.out.print("name: ");
				name = input.next();
				System.out.print("id: ");
				id = input.next();
				s = new Student(name, id);
				manager.addStudent(s);
			}
				break;

			case 3: {
				String id;
				System.out.print("Choose id to delete: ");
				id = input.next();
				manager.deleteStudent(id);
			}
				break;

			case 4: {
				String  id;
				Student s;
				System.out.print("Choose id to edit: ");
				id = input.next();
				 manager.editStudent(id);
			}
				break;
			}
		}
	}

}
