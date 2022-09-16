package Week_1;

public class ArraysDemo {

	public static void main(String[] args) {

		String[] students = new String[3];
		students[0] = "Student1";
		students[1] = "Student2";
		students[2] = "Student3";
		// students[3] = "Student4";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		for (String student : students) {
			System.out.println(student);
		}

	}

}
