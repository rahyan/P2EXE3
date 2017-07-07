package P2EXE3;

public class ProfessorController implements Controller {
	private Professor professor;
	private ProfessorView  view = new ProfessorView();

	public ProfessorController(Professor professor) {
		this.professor = professor;
	}

	public void setUserName(String name) {
		professor.setProfessorName(name);
	}

	public String getUserName() {
		return professor.getProfessorName();
	}

	public void setUserRollNo(String rollNo) {
		professor.setProfessorRollNo(rollNo);
	}

	public String getUserRollNo() {
		return professor.getProfessorRollNo();
	}

	public String updateView() {
		return view.printProfessorDetails(professor.getProfessorName(), professor.getProfessorRollNo());
	}
}
