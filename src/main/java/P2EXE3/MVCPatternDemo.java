package P2EXE3;

public class MVCPatternDemo {
	public static void main(String[] args) {

		//Pegar uma pessoa Cadastrada da Base de Dados
		//OBS: note que os type dos Users cadastrados são completamente
		//desassociados, dessa forma nao precisamos nos preocupar caso
		//quiséssemos criar outro tipo de User a ser cadastrado, como,
		//por exemplo, um Diretor.
		  Student user1 = (Student) retriveStudentFromDatabase(1); 
		  Professor user2 = (Professor) retriveStudentFromDatabase(2);
		
		
		//Note que a maneira de pegar o controlador eh a mesma indepedente
		//do tipo de User.
		Controller controller1 = ControllerFactory.getController(user1);
		Controller controller2 = ControllerFactory.getController(user2);
		
		
		//Chamando o View atras do controlador
		controller1.updateView();
		controller2.updateView();

		// Atualizando os dados usando o Controlador

		//codigo aqui
	}

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

}
