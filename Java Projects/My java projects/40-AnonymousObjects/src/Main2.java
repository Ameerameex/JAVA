
public class Main2 {

	public static void main(String[] args) {

		Student student = new Student(101, "Suriya", 98, 100, 99);
		Student student2 = new Student(102, "kumar", 97, 106, 95);
		Student student3 = new Student(007, "dhoni", 92, 103, 94);

		Student[] students;
		students = new Student[3];

		students[0] = student;
		students[1] = student2;
		students[2] = student3;
		// System.out.println(students[0].getTotal());
		// System.out.println(student.getTotal());
		// System.out.println(students[1].getTotal());
		// System.out.println(students[2].getAverage());

		for (int i = 0; i < students.length; i++) {

			System.out.print(students[i].getName() + "\t\t");
			System.out.print(students[i].getRollNumber() + "\t\t");

			System.out.print(students[i].getMark1() + "\t\t");
			System.out.print(students[i].getMark2() + "\t\t");
			System.out.print(students[i].getMark3() + "\t\t");
			System.out.println(students[i].getAverage());

		}
		student = null;
		student2 = null;
		student3 = null;

		students[0] = null;
		students[1] = null;
		students[2] = null;

		students = null;
		System.gc();

	}

}
