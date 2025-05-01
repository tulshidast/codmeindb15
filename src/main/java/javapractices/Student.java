package javapractices;

public class Student {

	String studentName;
	int rollNumber;
	char devision;

	public Student(String studentName, int rollNumber, char devision) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.devision = devision;
	}

	public void studentDetails() {
		System.out.println("Name : " + studentName + "Roll number : " + rollNumber + "devision : " + devision);
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", devision=" + devision + "]";
	}

}
