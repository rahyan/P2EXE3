package P2EXE3;


public class StudentController implements Controller{
	private Student student;
	private StudentView  view = new StudentView();

	public StudentController(Student student) {
		this.student = student;
	}

	public void setUserName(String name) {
		student.setStudentName(name);
	}

	public String getUserName() {
		return student.getStudentName();
	}

	public void setUserRollNo(String rollNo) {
		student.setStudentRollNo(rollNo);
	}

	public String getUserRollNo() {
		return student.getStudentRollNo();
	}

	public String updateView() {
		return view.printStudentDetails(student.getStudentName(), student.getStudentRollNo());
	}

}