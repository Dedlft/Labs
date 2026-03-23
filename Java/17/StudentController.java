package A;

public class StudentController{
	private Student model;
	private StudentView view;
	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;
	}
	public String getStudentName(){
		return model.getName();
	}
	public String getStudentRollNo(){
		return model.getRollNo();
	}
	public void setStudentName(String n){
		model.setName(n);
	}
	public void setStudentRollNo(String r){
		model.setRollNo(r);
	}
	public void updateView(){
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
