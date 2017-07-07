import static org.junit.Assert.*;

import org.junit.Test;

import P2EXE3.Controller;
import P2EXE3.ControllerFactory;
import P2EXE3.Professor;
import P2EXE3.Student;

public class testesP2EXE3 {

	private static Object retriveStudentFromDatabase(int i) {
		Object model;
		Student student = new Student();
		Professor professor = new Professor();
		
		switch(i) {
			case 1:
				student.setStudentName("Robert");
				student.setStudentRollNo("10");
				model = student;
				break;
				
			case 2:
				professor.setProfessorName("Paul");
				professor.setProfessorRollNo("20");
				model = professor;
				break;
				
			default:
				student.setStudentName("Rahyan");
				student.setStudentRollNo("1");
				model = student;
				
		}
		
		return model;
		
	}
	
	@Test
	public void teste() {
		Student user1 = (Student) retriveStudentFromDatabase(1); 
		Professor user2 = (Professor) retriveStudentFromDatabase(2);
		Controller controller1 = ControllerFactory.getController(user1);
		Controller controller2 = ControllerFactory.getController(user2);
		
		//Verificando que os dados foram criados corretamente
		assertEquals("Student: \nName: Robert\nRoll No: 10\n", controller1.updateView());
		assertEquals("Professor: \nName: Paul\nRoll No: 20\n", controller2.updateView());
		
		//Atualizando os dados
		controller1.setUserName("Rahyan"); controller1.setUserRollNo("30");
		controller2.setUserName("Barreto"); controller2.setUserRollNo("40");
		
		//Verificando que os dados foram atualizados
		assertEquals("Student: \nName: Rahyan\nRoll No: 30\n", controller1.updateView());
		assertEquals("Professor: \nName: Barreto\nRoll No: 40\n", controller2.updateView());
	}

}
