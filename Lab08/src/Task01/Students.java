package Task01;
public class Students {

	private String result;
	void Student(String result){
	this.result=result;
	}
	public String getResult() {
	return result;
	}
	public void setResult(String result) {
	this.result=result;
	}
	public String getName() {
	return "Arsalan Ali";
	}
	public String getRollNo() {
	return "2019-SE-239";
	}
	public String getCourseName() {
	return "Software Construction and Design";
	}
	public String getCourseCode() {
	return "SWE-312";
	}
	
	public static void main(String[] args) {
		System.out.println("\t''Student Information''");
		System.out.println("\n\tFailed in Previous!\n");
		Students obj = new Students ();
		System.out.println("Student Name: " + obj.getName());
		System.out.println("Roll Number: " + obj.getRollNo());
		System.out.println("Course Name: " + obj.getCourseName());
		System.out.println("Course Code: " + obj.getCourseCode());
		System.out.println("" +obj.getResult()+"\n");
		System.out.println("\tCleared and Promoted!\n");
		obj.setResult("PROMOTED");
		System.out.println("Student Name: " + obj.getName());
		System.out.println("Roll Number: " + obj.getRollNo());
		System.out.println("Course Name: " + obj.getCourseName());
		System.out.println("Course Code: " + obj.getCourseCode());
		System.out.println("" +obj.getResult());
		
		System.out.println("Changes Commit");
	}
}
