package P2EXE3;

public class ControllerFactory {

	public static Controller getController(Object user){	
		 
		if(user.getClass().getName() == "P2EXE3.Student"){
			return new StudentController((Student) user);
		}
		 
		else if(user.getClass().getName() == "P2EXE3.Professor"){
			return new ProfessorController((Professor) user);
		}
		
		else return null;
	 }
	
}
