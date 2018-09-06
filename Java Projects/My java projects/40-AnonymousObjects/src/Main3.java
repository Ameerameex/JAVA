
public class Main3 {

	public static void main(String[] args) {

		Student student = new Student(101, "Suriya", 105, 100, 99);
		Student student2 = new Student(102, "Ameer", 80, 50, 60);
		Student student3 = new Student(007, "dhoni", 92, 103, 94);

		Student[] students = { student, student2, student3, null, new Student(103, "Kohli", 96, 100, 99) };

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {

				System.out.print(students[i].getName() + "\t\t");
				System.out.print(students[i].getRollNumber() + "\t\t");

				System.out.print(students[i].getMark1() + "\t\t");
				System.out.print(students[i].getMark2() + "\t\t");
				System.out.print(students[i].getMark3() + "\t\t");
				System.out.println(students[i].getAverage());
			}
		}

		student = null;
		student2 = null;
		student3 = null;
		students[0] = null;
		students[1] = null;
		students[2] = null;
		students[3] = null;
		students = null;
		System.gc();

	}

}
